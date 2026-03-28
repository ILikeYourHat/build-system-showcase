#!/usr/bin/env bash

set -euo pipefail

# Check argument
if [ "$#" -ne 1 ]; then
  echo "Usage: $0 <file>"
  exit 1
fi

FILE="$1"

# Check file exists
if [ ! -f "$FILE" ]; then
  echo "Error: File '$FILE' does not exist."
  exit 1
fi

# Run Java program
OUTPUT=$(java -jar "$FILE")
echo "$OUTPUT"

# Assert output contains "Test line"
if echo "$OUTPUT" | grep -q "Here goes the joke:"; then
  echo "Assertion passed, program compiled correctly"
  exit 0
else
  echo "Assertion failed"
  exit 1
fi
