#!/bin/sh
CLASS=$1

shift

JAVA_HOME=`cat java_home`
JAVA_ARGUMENTS=`cat java_arguments`
JAVA_MEMORY=`cat java_memory`

# replace all ";" by ":" in arguments because linux and window's classpath separator are different
JAVA_ARGUMENTS=$(echo $JAVA_ARGUMENTS|sed 's/;/:/g')

"$JAVA_HOME/bin/java" -Xmx${JAVA_MEMORY}m $JAVA_ARGUMENTS $CLASS $*