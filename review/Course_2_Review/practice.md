1. beautiful
```java
String lower = str.LowerCase();
HashMap<Character, Integer> map = new HashMap<>();

for (char c: lower.toCharArray) {
    if (Character.isLetter(c)) {
        map.put(c, map.getOrDefault(c, 0) + 1)
    }
}
Character previousChar = null;

for (char c = 'a'; c<='z'; c++) {
    if(map.containsKey(c)) {
        if (previousChar != null) {
            
            int nextCount = map.get(c);
            int previousCount = map.get(previousChar);

            if (nextCount > previousCount) {
                return true;
            }
        }
        previousChar = c;
    }
}

return true;
```

2. reverse words
```java
String[] words = sentence.trim().split("\\s+");
Collections.reverse(Arrays.asList(words));
return String.join(" ", words)
```

3. matrix
```java
int R = matrix.length;
int C = matrix[0].length;

boolean[] row = new boolean[R];
boolean[] column = new boolean column[C];

for (int i = 0; i < R; i++) {
    for (int j = 0; j < C; j++) {
        if(matrix[i][j] == 0) {
            row[i] = true;
            column[j] = true;
        }
    }
}

for (int i = 0; i < R; i++) {
    for (int j = 0; j < C; j++) {
        if(row[i] || column[j]) {
            matrix[i][j] = 0;
        }
    }
}

return matrix;
```

4. spiral
```java
int R = matrix.length;
int C = matrix[0].length;

int top = 0;
int bottom = R -1
int left = 0
int right = C -1

ArrayList<Integer> resultList = new ArrayList<>();

while (left <= right && top <= bottom) {

    for (j=left; j<+right; j++) {
        resultList.add(matrix[top][j])
    }
    top++;

    for (i=top; i<=bottom: i++) {
        resultList.add(matrix[i][right])
    }
    right--;

    if (left <= right) {
        for(j=right; j>= left; j--) {
            resultList.add(matrix[bottom][j])
        }
        bottom--;
    }
    if (top <= bottom) {
        for(i=bottom; i>=top; i--) {
            resultList.add(matrix[i][left])
        }
        left++;
    }
}

int [] resultArray = new int[resultList.size()];
for (i = 0; i < resultList.size(); i++) {
    resultArray[i] = resultList.get(i)
}

return resultArray;

```