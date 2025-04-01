set -ex
export repo_dir=$(realpath $(dirname "${BASH_SOURCE[0]}")/../../)
pushd "${repo_dir}/clients"

# Variants are based on the generator version
variant="$1"

# find all generated clients' pom.xml
find . -wholename "*${variant}/pom.xml" -not -path '*/target/*' > pom_list
cat pom_list

# format result to list of Maven modules
cat pom_list | cut -d'/' -f2-4 \
| sed 's/\(.*\)/<module>\1<\/module>/' > module_list
cat module_list

# produce a temporary pom with the modules
(echo "<project><modelVersion>4.0.0</modelVersion><groupId>temp</groupId><artifactId>temp</artifactId><version>1.0</version><packaging>pom</packaging><modules>"; cat module_list; echo "</modules></project>") > pom.xml
cat pom.xml

# test compilation
mvn clean compile -T 1.5C -Dmaven.testSkip=true -Denforcer.skip -fae --fail-at-end 2>&1 | tee out
cat out | grep -E "^\[ERROR\] Failed to execute goal" > errors
if [[ $(cat errors | wc -l) -gt 0 ]]; then
	echo "Compilation errors found"
	exit 1
fi
