# MP2: GRAPHS, SEA LEVELS AND MIND BOGGLES (Feedback)

## Grade: B

**Compiles**: Yes:Yes:Yes:Yes:Yes

**Timeout**: No:No:No:No:No

## Test Results
### cpen221.mp2.Task1ALTests
| Test Status | Count |
| ----------- | ----- |
|tests|10|
|skipped|0|
|failures|0|
|errors|0|
### cpen221.mp2.Task1AMTests
| Test Status | Count |
| ----------- | ----- |
|tests|10|
|skipped|0|
|failures|0|
|errors|0|

### cpen221.mp2.Task2Tests
| Test Status | Count |
| ----------- | ----- |
|tests|11|
|skipped|0|
|failures|3|
|errors|0|
#### Failed Tests
1. `testAllEdges() (java.util.ConcurrentModificationException)`
1. `testRemoveVertex() (java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "java.util.Map.get(Object)" is null)`
1. `testRemoveEdge() (java.util.ConcurrentModificationException)`

### cpen221.mp2.Task3Tests
| Test Status | Count |
| ----------- | ----- |
|tests|19|
|skipped|0|
|failures|8|
|errors|0|
#### Failed Tests
1. `[1] cpen221.mp2.graph.ALGraph@5398edd0, cpen221.mp2.graph.Vertex@42, 9, {cpen221.mp2.graph.Vertex@44=cpen221.mp2.graph.Edge@86, cpen221.mp2.graph.Vertex@48=cpen221.mp2.graph.Edge@8a} (org.opentest4j.AssertionFailedError: expected: <{cpen221.mp2.graph.Vertex@44=cpen221.mp2.graph.Edge@86, cpen221.mp2.graph.Vertex@48=cpen221.mp2.graph.Edge@8a}> but was: <{cpen221.mp2.graph.Vertex@44=cpen221.mp2.graph.Edge@86}>)`
1. `testDangerLevels2() (org.opentest4j.AssertionFailedError: actual array was <null>)`
1. `testDangerLevels3() (org.opentest4j.AssertionFailedError: actual array was <null>)`
1. `testIsSubmerged() (org.opentest4j.AssertionFailedError: array contents differ at index [0][0], expected: <true> but was: <false>)`
1. `testIsSubmerged2() (org.opentest4j.AssertionFailedError: array contents differ at index [0][0], expected: <true> but was: <false>)`
1. `testDangerLevels() (org.opentest4j.AssertionFailedError: actual array was <null>)`
1. `testMinPathCost() (org.opentest4j.AssertionFailedError: expected: <5> but was: <0>)`
1. `testPathCost() (org.opentest4j.AssertionFailedError: expected: <5> but was: <0>)`

### cpen221.mp2.Task4Tests
| Test Status | Count |
| ----------- | ----- |
|tests|2|
|skipped|0|
|failures|2|
|errors|0|
#### Failed Tests
1. `initializationError (java.lang.ExceptionInInitializerError)`
1. `initializationError (java.lang.NoClassDefFoundError: Could not initialize class cpen221.mp2.Task4Tests)`

### cpen221.mp2.Task5ATests
| Test Status | Count |
| ----------- | ----- |
|tests|9|
|skipped|0|
|failures|9|
|errors|0|
#### Failed Tests
1. `getAllValidWords() (java.lang.IllegalArgumentException: Vertices cannot be null)`
1. `test1() (java.lang.IllegalArgumentException: Vertices cannot be null)`
1. `test2() (org.opentest4j.AssertionFailedError: expected: <[QUEUE]> but was: <[]>)`
1. `test3() (org.opentest4j.AssertionFailedError: expected: <[YAK]> but was: <[]>)`
1. `test4() (java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4)`
1. `test5() (java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4)`
1. `test6() (java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 4)`
1. `test7() (org.opentest4j.AssertionFailedError: expected: <[FISH, HATE]> but was: <[CAT, FISH, HATE]>)`
1. `test8() (java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4)`

## Code Coverage
### SeaLevels
| Metric | Coverage |
| ------ | -------- |
|LINE_MISSED|6|
|LINE_COVERED|0|
|BRANCH_MISSED|0|
|BRANCH_COVERED|0|
### ALGraph
| Metric | Coverage |
| ------ | -------- |
|LINE_MISSED|135|
|LINE_COVERED|117|
|BRANCH_MISSED|87|
|BRANCH_COVERED|57|
### AMGraph
| Metric | Coverage |
| ------ | -------- |
|LINE_MISSED|111|
|LINE_COVERED|77|
|BRANCH_MISSED|74|
|BRANCH_COVERED|48|
### BogglePlayer
| Metric | Coverage |
| ------ | -------- |
|LINE_MISSED|116|
|LINE_COVERED|0|
|BRANCH_MISSED|44|
|BRANCH_COVERED|0|

## Comments


**Detailed Code Analysis**

| Filename | Line | Issue | Explanation |
| -------- | ---- | ----- | ----------- |
|ALGraph.java|5|	CyclomaticComplexity|	The class 'ALGraph' has a total cyclomatic complexity of 100 (highest 9).|
|ALGraph.java|6|	TooManyMethods|	This class has too many methods, consider refactoring it.|
|ALGraph.java|17|	BeanMembersShouldSerialize|	Found non-transient, non-static member. Please mark as transient or provide accessors.|
|ALGraph.java|17|	ImmutableField|	Private field 'adjacencyList' could be made final; it is only initialized in the declaration or constructor.|
|ALGraph.java|46|	LawOfDemeter|	Potential violation of Law of Demeter (method chain calls)|
|ALGraph.java|47|	LawOfDemeter|	Potential violation of Law of Demeter (method chain calls)|
|ALGraph.java|72|	LawOfDemeter|	Potential violation of Law of Demeter (method chain calls)|
|ALGraph.java|72|	LawOfDemeter|	Potential violation of Law of Demeter (method chain calls)|
|ALGraph.java|74|	LawOfDemeter|	Potential violation of Law of Demeter (method chain calls)|
|ALGraph.java|74|	LawOfDemeter|	Potential violation of Law of Demeter (method chain calls)|
|ALGraph.java|117|	DataflowAnomalyAnalysis|	Found 'DD'-anomaly for variable 'flag' (lines '117'-'123').|
|ALGraph.java|122|	LawOfDemeter|	Potential violation of Law of Demeter (object not created locally)|
|ALGraph.java|123|	DataflowAnomalyAnalysis|	Found 'DD'-anomaly for variable 'flag' (lines '123'-'123').|
|ALGraph.java|129|	LawOfDemeter|	Potential violation of Law of Demeter (method chain calls)|
|ALGraph.java|129|	LawOfDemeter|	Potential violation of Law of Demeter (method chain calls)|
|ALGraph.java|129|	UseCollectionIsEmpty|	Substitute calls to size() == 0 (or size() != 0, size() > 0, size() < 1) with calls to isEmpty()|
|ALGraph.java|132|	LawOfDemeter|	Potential violation of Law of Demeter (method chain calls)|
|ALGraph.java|132|	LawOfDemeter|	Potential violation of Law of Demeter (method chain calls)|
|ALGraph.java|132|	UseCollectionIsEmpty|	Substitute calls to size() == 0 (or size() != 0, size() > 0, size() < 1) with calls to isEmpty()|
|ALGraph.java|162|	DataflowAnomalyAnalysis|	Found 'DU'-anomaly for variable 'es2' (lines '162'-'171').|
|ALGraph.java|164|	LawOfDemeter|	Potential violation of Law of Demeter (object not created locally)|
|ALGraph.java|194|	LawOfDemeter|	Potential violation of Law of Demeter (method chain calls)|
|ALGraph.java|194|	LawOfDemeter|	Potential violation of Law of Demeter (method chain calls)|
|ALGraph.java|207|	LawOfDemeter|	Potential violation of Law of Demeter (method chain calls)|
|ALGraph.java|219|	SwitchStmtsShouldHaveDefault|	Switch statements should be exhaustive, add a default case (or missing enum branches)|
|ALGraph.java|227|	SystemPrintln|	System.out.println is used|
|ALGraph.java|239|	DataflowAnomalyAnalysis|	Found 'DD'-anomaly for variable 'list' (lines '239'-'242').|
|ALGraph.java|239|	DataflowAnomalyAnalysis|	Found 'DD'-anomaly for variable 'list' (lines '239'-'245').|
|ALGraph.java|239|	DataflowAnomalyAnalysis|	Found 'DD'-anomaly for variable 'list' (lines '239'-'248').|
|ALGraph.java|240|	SwitchStmtsShouldHaveDefault|	Switch statements should be exhaustive, add a default case (or missing enum branches)|
|ALGraph.java|273|	LawOfDemeter|	Potential violation of Law of Demeter (object not created locally)|
|ALGraph.java|278|	DataflowAnomalyAnalysis|	Found 'DD'-anomaly for variable 'neighbor' (lines '278'-'280').|
|ALGraph.java|278|	DataflowAnomalyAnalysis|	Found 'DD'-anomaly for variable 'neighbor' (lines '278'-'282').|
|ALGraph.java|278|	UnusedAssignment|	The initializer for variable 'neighbor' is never used (overwritten on lines 280 and 282)|
|ALGraph.java|279|	LawOfDemeter|	Potential violation of Law of Demeter (method chain calls)|
|ALGraph.java|328|	LawOfDemeter|	Potential violation of Law of Demeter (object not created locally)|
|ALGraph.java|333|	DataflowAnomalyAnalysis|	Found 'DD'-anomaly for variable 'neighbor' (lines '333'-'335').|
|ALGraph.java|333|	DataflowAnomalyAnalysis|	Found 'DD'-anomaly for variable 'neighbor' (lines '333'-'337').|
|ALGraph.java|333|	UnusedAssignment|	The initializer for variable 'neighbor' is never used (overwritten on lines 335 and 337)|
|ALGraph.java|334|	LawOfDemeter|	Potential violation of Law of Demeter (method chain calls)|
|ALGraph.java|376|	LawOfDemeter|	Potential violation of Law of Demeter (method chain calls)|
|ALGraph.java|383|	LawOfDemeter|	Potential violation of Law of Demeter (object not created locally)|
|ALGraph.java|388|	DataflowAnomalyAnalysis|	Found 'DD'-anomaly for variable 'neighbor' (lines '388'-'390').|
|ALGraph.java|388|	DataflowAnomalyAnalysis|	Found 'DD'-anomaly for variable 'neighbor' (lines '388'-'392').|
|ALGraph.java|388|	UnusedAssignment|	The initializer for variable 'neighbor' is never used (overwritten on lines 390 and 392)|
|ALGraph.java|389|	LawOfDemeter|	Potential violation of Law of Demeter (method chain calls)|
|ALGraph.java|426|	LawOfDemeter|	Potential violation of Law of Demeter (object not created locally)|
|ALGraph.java|426|	LawOfDemeter|	Potential violation of Law of Demeter (object not created locally)|
|ALGraph.java|426|	LawOfDemeter|	Potential violation of Law of Demeter (object not created locally)|
|ALGraph.java|426|	LawOfDemeter|	Potential violation of Law of Demeter (object not created locally)|
|ALGraph.java|463|	LawOfDemeter|	Potential violation of Law of Demeter (method chain calls)|
## Checkstyle Results
### `BoggleBoard.java`
| Line | Column | Message |
| ---- | ------ | ------- |
| 68 | 13 | `'4' is a magic number.` |
| 69 | 13 | `'4' is a magic number.` |
| 74 | 47 | `'*' is not followed by whitespace.` |
| 74 | 47 | `'*' is not preceded with whitespace.` |
| 74 | 49 | `'+' is not followed by whitespace.` |
| 74 | 49 | `'+' is not preceded with whitespace.` |
| 89 | 9 | `'if' construct must use '{}'s.` |
| 90 | 9 | `'if' construct must use '{}'s.` |
| 95 | 17 | `'if' construct must use '{}'s.` |
| 97 | 22 | `'if' construct must use '{}'s.` |
| 99 | 22 | `'if' construct must use '{}'s.` |
| 101 | 17 | `'else' construct must use '{}'s.` |
| 116 | 9 | `'if' construct must use '{}'s.` |
| 117 | 9 | `'if' construct must use '{}'s.` |
| 134 | 9 | `'if' construct must use '{}'s.` |
| 136 | 9 | `'if' construct must use '{}'s.` |
| 139 | 13 | `'if' construct must use '{}'s.` |
| 142 | 17 | `'if' construct must use '{}'s.` |
| 186 | 17 | `'if' construct must use '{}'s.` |
| 187 | 17 | `'else' construct must use '{}'s.` |
| 207 | 46 | `'4' is a magic number.` |
| 207 | 49 | `'4' is a magic number.` |
| 214 | 13 | `'{' is followed by whitespace.` |
| 215 | 13 | `'{' is followed by whitespace.` |
| 216 | 13 | `'{' is followed by whitespace.` |
| 217 | 13 | `'{' is followed by whitespace.` |
### `BoggleGUI.java`
| Line | Column | Message |
| ---- | ------ | ------- |
| 57 | 13 | `'array initialization' child has incorrect indentation level 12, expected level should be 8.` |
| 58 | 13 | `'array initialization' child has incorrect indentation level 12, expected level should be 8.` |
| 59 | 13 | `'array initialization' child has incorrect indentation level 12, expected level should be 8.` |
| 60 | 13 | `'array initialization' child has incorrect indentation level 12, expected level should be 8.` |
| 111 | 5 | `Method BoggleGUI length is 285 lines (max allowed is 80).` |
| 203 | 25 | `'.' should be on the previous line.` |
| 204 | 33 | `'.' should be on the previous line.` |
| 205 | 33 | `'.' should be on the previous line.` |
| 206 | 33 | `'.' should be on the previous line.` |
| 207 | 33 | `'.' should be on the previous line.` |
| 211 | None | `Line is longer than 120 characters (found 123).` |
| 211 | 25 | `'.' should be on the previous line.` |
| 212 | None | `Line is longer than 120 characters (found 131).` |
| 212 | 25 | `'.' should be on the previous line.` |
| 213 | None | `Line is longer than 120 characters (found 134).` |
| 213 | 25 | `'.' should be on the previous line.` |
| 214 | None | `Line is longer than 120 characters (found 129).` |
| 214 | 25 | `'.' should be on the previous line.` |
| 215 | None | `Line is longer than 120 characters (found 132).` |
| 215 | 25 | `'.' should be on the previous line.` |
| 216 | None | `Line is longer than 120 characters (found 141).` |
| 216 | 25 | `'.' should be on the previous line.` |
| 217 | None | `Line is longer than 120 characters (found 134).` |
| 217 | 25 | `'.' should be on the previous line.` |
| 218 | None | `Line is longer than 120 characters (found 136).` |
| 218 | 25 | `'.' should be on the previous line.` |
| 219 | None | `Line is longer than 120 characters (found 123).` |
| 219 | 25 | `'.' should be on the previous line.` |
| 232 | None | `Line is longer than 120 characters (found 138).` |
| 245 | 61 | `'300' is a magic number.` |
| 245 | 66 | `'145' is a magic number.` |
| 260 | 25 | `'.' should be on the previous line.` |
| 261 | 33 | `'.' should be on the previous line.` |
| 262 | 33 | `'.' should be on the previous line.` |
| 263 | 33 | `'.' should be on the previous line.` |
| 267 | None | `Line is longer than 120 characters (found 123).` |
| 267 | 25 | `'.' should be on the previous line.` |
| 268 | None | `Line is longer than 120 characters (found 125).` |
| 268 | 25 | `'.' should be on the previous line.` |
| 269 | None | `Line is longer than 120 characters (found 134).` |
| 269 | 25 | `'.' should be on the previous line.` |
| 270 | None | `Line is longer than 120 characters (found 143).` |
| 270 | 25 | `'.' should be on the previous line.` |
| 271 | None | `Line is longer than 120 characters (found 134).` |
| 271 | 25 | `'.' should be on the previous line.` |
| 272 | None | `Line is longer than 120 characters (found 142).` |
| 272 | 25 | `'.' should be on the previous line.` |
| 273 | None | `Line is longer than 120 characters (found 123).` |
| 273 | 25 | `'.' should be on the previous line.` |
| 291 | None | `Line is longer than 120 characters (found 138).` |
| 311 | 71 | `'22' is a magic number.` |
| 319 | 25 | `'.' should be on the previous line.` |
| 320 | 33 | `'.' should be on the previous line.` |
| 321 | 33 | `'.' should be on the previous line.` |
| 322 | 33 | `'.' should be on the previous line.` |
| 323 | 33 | `'.' should be on the previous line.` |
| 324 | 17 | `Comment has incorrect indentation level 16, expected is 8, indentation should be the same level as line 325.` |
| 328 | None | `Line is longer than 120 characters (found 123).` |
| 328 | 25 | `'.' should be on the previous line.` |
| 329 | None | `Line is longer than 120 characters (found 131).` |
| 329 | 25 | `'.' should be on the previous line.` |
| 330 | None | `Line is longer than 120 characters (found 134).` |
| 330 | 25 | `'.' should be on the previous line.` |
| 331 | None | `Line is longer than 120 characters (found 137).` |
| 331 | 25 | `'.' should be on the previous line.` |
| 332 | None | `Line is longer than 120 characters (found 134).` |
| 332 | 25 | `'.' should be on the previous line.` |
| 333 | None | `Line is longer than 120 characters (found 146).` |
| 333 | 25 | `'.' should be on the previous line.` |
| 334 | None | `Line is longer than 120 characters (found 134).` |
| 334 | 25 | `'.' should be on the previous line.` |
| 335 | None | `Line is longer than 120 characters (found 137).` |
| 335 | 25 | `'.' should be on the previous line.` |
| 336 | None | `Line is longer than 120 characters (found 146).` |
| 337 | None | `Line is longer than 120 characters (found 146).` |
| 338 | None | `Line is longer than 120 characters (found 123).` |
| 338 | 25 | `'.' should be on the previous line.` |
| 349 | None | `Line is longer than 120 characters (found 125).` |
| 349 | 25 | `'.' should be on the previous line.` |
| 350 | None | `Line is longer than 120 characters (found 133).` |
| 350 | 25 | `'.' should be on the previous line.` |
| 351 | None | `Line is longer than 120 characters (found 134).` |
| 351 | 25 | `'.' should be on the previous line.` |
| 352 | None | `Line is longer than 120 characters (found 128).` |
| 352 | 25 | `'.' should be on the previous line.` |
| 353 | None | `Line is longer than 120 characters (found 134).` |
| 353 | 25 | `'.' should be on the previous line.` |
| 354 | None | `Line is longer than 120 characters (found 132).` |
| 354 | 25 | `'.' should be on the previous line.` |
| 355 | None | `Line is longer than 120 characters (found 125).` |
| 355 | 25 | `'.' should be on the previous line.` |
| 359 | 25 | `'.' should be on the previous line.` |
| 360 | 33 | `'.' should be on the previous line.` |
| 361 | 33 | `'.' should be on the previous line.` |
| 362 | 33 | `'.' should be on the previous line.` |
| 407 | 28 | `'4' is a magic number.` |
| 408 | 28 | `'4' is a magic number.` |
| 413 | 21 | `'}' at column 21 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 424 | 21 | `'}' at column 21 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 453 | 27 | `'4' is a magic number.` |
| 453 | 46 | `'4' is a magic number.` |
| 495 | 79 | `'3' is a magic number.` |
| 507 | 39 | `'4' is a magic number.` |
| 523 | 44 | `'1000' is a magic number.` |
| 593 | None | `Line is longer than 120 characters (found 128).` |
| 630 | 39 | `'4' is a magic number.` |
| 651 | 22 | `'5' is a magic number.` |
| 653 | 30 | `'5' is a magic number.` |
| 655 | 30 | `'6' is a magic number.` |
| 656 | 26 | `'3' is a magic number.` |
| 657 | 30 | `'7' is a magic number.` |
| 658 | 26 | `'5' is a magic number.` |
| 660 | 26 | `'11' is a magic number.` |
| 675 | None | `Line is longer than 120 characters (found 132).` |
| 684 | None | `Line is longer than 120 characters (found 132).` |
| 698 | None | `Line is longer than 120 characters (found 154).` |
| 720 | None | `Line is longer than 120 characters (found 129).` |
| 760 | 32 | `'60' is a magic number.` |
| 767 | 9 | `Method BoardPanel length is 101 lines (max allowed is 80).` |
| 776 | 68 | `'28' is a magic number.` |
| 782 | 50 | `'146' is a magic number.` |
| 782 | 55 | `'183' is a magic number.` |
| 782 | 60 | `'219' is a magic number.` |
| 806 | 76 | `'146' is a magic number.` |
| 806 | 81 | `'183' is a magic number.` |
| 806 | 86 | `'219' is a magic number.` |
| 821 | None | `Line is longer than 120 characters (found 134).` |
| 875 | 50 | `'146' is a magic number.` |
| 875 | 55 | `'183' is a magic number.` |
| 875 | 60 | `'219' is a magic number.` |
| 885 | 60 | `'8' is a magic number.` |
| 923 | 56 | `'232' is a magic number.` |
| 923 | 61 | `'237' is a magic number.` |
| 923 | 66 | `'76' is a magic number.` |
| 938 | 56 | `'146' is a magic number.` |
| 938 | 61 | `'183' is a magic number.` |
| 938 | 66 | `'219' is a magic number.` |
### `BogglePlayer.java`
| Line | Column | Message |
| ---- | ------ | ------- |
| 9 | 8 | `Unused import - java.util.TreeSet.` |
| 15 | 38 | `'4' is a magic number.` |
| 15 | 41 | `'4' is a magic number.` |
| 53 | 25 | `'if' is not followed by whitespace.` |
| 53 | 25 | `'if' is not followed by whitespace.` |
| 53 | 43 | `'{' is not preceded with whitespace.` |
| 65 | 5 | `Method addEdges length is 91 lines (max allowed is 80).` |
| 67 | 23 | `'=' is not followed by whitespace.` |
| 67 | 23 | `'=' is not preceded with whitespace.` |
| 67 | 25 | `';' is not followed by whitespace.` |
| 67 | 27 | `'<' is not followed by whitespace.` |
| 67 | 27 | `'<' is not preceded with whitespace.` |
| 67 | 46 | `';' is not followed by whitespace.` |
| 70 | 51 | `'3' is a magic number.` |
| 70 | 54 | `'3' is a magic number.` |
| 71 | 51 | `'3' is a magic number.` |
| 72 | 51 | `'3' is a magic number.` |
| 73 | 54 | `'3' is a magic number.` |
| 75 | 54 | `'3' is a magic number.` |
| 78 | 53 | `'3' is a magic number.` |
| 79 | 51 | `'3' is a magic number.` |
| 79 | 55 | `'-' is not followed by whitespace.` |
| 79 | 55 | `'-' is not preceded with whitespace.` |
| 80 | 51 | `'3' is a magic number.` |
| 81 | 51 | `'3' is a magic number.` |
| 81 | 55 | `'+' is not followed by whitespace.` |
| 81 | 55 | `'+' is not preceded with whitespace.` |
| 82 | 55 | `'-' is not followed by whitespace.` |
| 82 | 55 | `'-' is not preceded with whitespace.` |
| 83 | 55 | `'+' is not followed by whitespace.` |
| 83 | 55 | `'+' is not preceded with whitespace.` |
| 84 | 55 | `'-' is not followed by whitespace.` |
| 84 | 55 | `'-' is not preceded with whitespace.` |
| 86 | 55 | `'+' is not followed by whitespace.` |
| 86 | 55 | `'+' is not preceded with whitespace.` |
| 87 | 17 | `'}' is not followed by whitespace.` |
| 87 | 18 | `'else' is not preceded with whitespace.` |
| 87 | 37 | `'4' is a magic number.` |
| 88 | 51 | `'3' is a magic number.` |
| 88 | 55 | `'-' is not followed by whitespace.` |
| 88 | 55 | `'-' is not preceded with whitespace.` |
| 89 | 51 | `'3' is a magic number.` |
| 90 | 51 | `'3' is a magic number.` |
| 91 | 55 | `'-' is not followed by whitespace.` |
| 91 | 55 | `'-' is not preceded with whitespace.` |
| 93 | 55 | `'-' is not followed by whitespace.` |
| 93 | 55 | `'-' is not preceded with whitespace.` |
| 96 | 17 | `'}' is not followed by whitespace.` |
| 96 | 18 | `'else' is not preceded with whitespace.` |
| 96 | 37 | `'5' is a magic number.` |
| 96 | 38 | `'||' is not followed by whitespace.` |
| 96 | 38 | `'||' is not preceded with whitespace.` |
| 96 | 46 | `'==' is not followed by whitespace.` |
| 96 | 46 | `'==' is not preceded with whitespace.` |
| 96 | 48 | `'9' is a magic number.` |
| 97 | 52 | `'-' is not followed by whitespace.` |
| 97 | 52 | `'-' is not preceded with whitespace.` |
| 97 | 56 | `'3' is a magic number.` |
| 98 | 52 | `'-' is not followed by whitespace.` |
| 98 | 52 | `'-' is not preceded with whitespace.` |
| 99 | 52 | `'-' is not followed by whitespace.` |
| 99 | 52 | `'-' is not preceded with whitespace.` |
| 99 | 57 | `'+' is not followed by whitespace.` |
| 99 | 57 | `'+' is not preceded with whitespace.` |
| 100 | 54 | `'3' is a magic number.` |
| 101 | 55 | `'+' is not followed by whitespace.` |
| 101 | 55 | `'+' is not preceded with whitespace.` |
| 102 | 52 | `'+' is not followed by whitespace.` |
| 102 | 52 | `'+' is not preceded with whitespace.` |
| 102 | 56 | `'3' is a magic number.` |
| 103 | 52 | `'+' is not followed by whitespace.` |
| 103 | 52 | `'+' is not preceded with whitespace.` |
| 104 | 52 | `'+' is not followed by whitespace.` |
| 104 | 52 | `'+' is not preceded with whitespace.` |
| 104 | 57 | `'+' is not followed by whitespace.` |
| 104 | 57 | `'+' is not preceded with whitespace.` |
| 105 | 17 | `'}' is not followed by whitespace.` |
| 105 | 18 | `'else' is not preceded with whitespace.` |
| 105 | 37 | `'8' is a magic number.` |
| 105 | 38 | `'||' is not followed by whitespace.` |
| 105 | 38 | `'||' is not preceded with whitespace.` |
| 105 | 46 | `'==' is not followed by whitespace.` |
| 105 | 46 | `'==' is not preceded with whitespace.` |
| 105 | 48 | `'12' is a magic number.` |
| 106 | 52 | `'-' is not followed by whitespace.` |
| 106 | 52 | `'-' is not preceded with whitespace.` |
| 106 | 57 | `'-' is not followed by whitespace.` |
| 106 | 57 | `'-' is not preceded with whitespace.` |
| 107 | 52 | `'-' is not followed by whitespace.` |
| 107 | 52 | `'-' is not preceded with whitespace.` |
| 108 | 52 | `'-' is not followed by whitespace.` |
| 108 | 52 | `'-' is not preceded with whitespace.` |
| 109 | 55 | `'-' is not followed by whitespace.` |
| 109 | 55 | `'-' is not preceded with whitespace.` |
| 111 | 52 | `'+' is not followed by whitespace.` |
| 111 | 52 | `'+' is not preceded with whitespace.` |
| 111 | 57 | `'-' is not followed by whitespace.` |
| 111 | 57 | `'-' is not preceded with whitespace.` |
| 112 | 52 | `'+' is not followed by whitespace.` |
| 112 | 52 | `'+' is not preceded with whitespace.` |
| 113 | 52 | `'+' is not followed by whitespace.` |
| 113 | 52 | `'+' is not preceded with whitespace.` |
| 114 | 17 | `'}' is not followed by whitespace.` |
| 114 | 18 | `'else' is not preceded with whitespace.` |
| 114 | 37 | `'13' is a magic number.` |
| 115 | 52 | `'-' is not followed by whitespace.` |
| 115 | 52 | `'-' is not preceded with whitespace.` |
| 115 | 56 | `'3' is a magic number.` |
| 116 | 52 | `'-' is not followed by whitespace.` |
| 116 | 52 | `'-' is not preceded with whitespace.` |
| 117 | 52 | `'-' is not followed by whitespace.` |
| 117 | 52 | `'-' is not preceded with whitespace.` |
| 117 | 57 | `'+' is not followed by whitespace.` |
| 117 | 57 | `'+' is not preceded with whitespace.` |
| 118 | 54 | `'3' is a magic number.` |
| 119 | 55 | `'+' is not followed by whitespace.` |
| 119 | 55 | `'+' is not preceded with whitespace.` |
| 120 | 54 | `'3' is a magic number.` |
| 122 | 55 | `'+' is not followed by whitespace.` |
| 122 | 55 | `'+' is not preceded with whitespace.` |
| 123 | 17 | `'}' is not followed by whitespace.` |
| 123 | 18 | `'else' is not preceded with whitespace.` |
| 123 | 37 | `'14' is a magic number.` |
| 123 | 39 | `'||' is not followed by whitespace.` |
| 123 | 39 | `'||' is not preceded with whitespace.` |
| 123 | 47 | `'==' is not followed by whitespace.` |
| 123 | 47 | `'==' is not preceded with whitespace.` |
| 123 | 49 | `'15' is a magic number.` |
| 124 | 52 | `'-' is not followed by whitespace.` |
| 124 | 52 | `'-' is not preceded with whitespace.` |
| 124 | 57 | `'-' is not followed by whitespace.` |
| 124 | 57 | `'-' is not preceded with whitespace.` |
| 125 | 52 | `'-' is not followed by whitespace.` |
| 125 | 52 | `'-' is not preceded with whitespace.` |
| 126 | 52 | `'-' is not followed by whitespace.` |
| 126 | 52 | `'-' is not preceded with whitespace.` |
| 126 | 57 | `'+' is not followed by whitespace.` |
| 126 | 57 | `'+' is not preceded with whitespace.` |
| 127 | 55 | `'-' is not followed by whitespace.` |
| 127 | 55 | `'-' is not preceded with whitespace.` |
| 128 | 55 | `'+' is not followed by whitespace.` |
| 128 | 55 | `'+' is not preceded with whitespace.` |
| 129 | 55 | `'-' is not followed by whitespace.` |
| 129 | 55 | `'-' is not preceded with whitespace.` |
| 131 | 55 | `'+' is not followed by whitespace.` |
| 131 | 55 | `'+' is not preceded with whitespace.` |
| 132 | 17 | `'}' is not followed by whitespace.` |
| 132 | 18 | `'else' is not preceded with whitespace.` |
| 132 | 37 | `'16' is a magic number.` |
| 133 | 52 | `'-' is not followed by whitespace.` |
| 133 | 52 | `'-' is not preceded with whitespace.` |
| 133 | 57 | `'-' is not followed by whitespace.` |
| 133 | 57 | `'-' is not preceded with whitespace.` |
| 134 | 52 | `'-' is not followed by whitespace.` |
| 134 | 52 | `'-' is not preceded with whitespace.` |
| 135 | 52 | `'-' is not followed by whitespace.` |
| 135 | 52 | `'-' is not preceded with whitespace.` |
| 136 | 55 | `'-' is not followed by whitespace.` |
| 136 | 55 | `'-' is not preceded with whitespace.` |
| 138 | 55 | `'-' is not followed by whitespace.` |
| 138 | 55 | `'-' is not preceded with whitespace.` |
| 141 | 17 | `'}' is not followed by whitespace.` |
| 141 | 18 | `'else' is not followed by whitespace.` |
| 141 | 18 | `'else' is not followed by whitespace.` |
| 141 | 18 | `'else' is not preceded with whitespace.` |
| 141 | 22 | `'{' is not preceded with whitespace.` |
| 142 | 52 | `'-' is not followed by whitespace.` |
| 142 | 52 | `'-' is not preceded with whitespace.` |
| 142 | 57 | `'-' is not followed by whitespace.` |
| 142 | 57 | `'-' is not preceded with whitespace.` |
| 143 | 52 | `'-' is not followed by whitespace.` |
| 143 | 52 | `'-' is not preceded with whitespace.` |
| 144 | 52 | `'-' is not followed by whitespace.` |
| 144 | 52 | `'-' is not preceded with whitespace.` |
| 144 | 57 | `'+' is not followed by whitespace.` |
| 144 | 57 | `'+' is not preceded with whitespace.` |
| 145 | 55 | `'-' is not followed by whitespace.` |
| 145 | 55 | `'-' is not preceded with whitespace.` |
| 146 | 55 | `'+' is not followed by whitespace.` |
| 146 | 55 | `'+' is not preceded with whitespace.` |
| 147 | 52 | `'+' is not followed by whitespace.` |
| 147 | 52 | `'+' is not preceded with whitespace.` |
| 147 | 57 | `'-' is not followed by whitespace.` |
| 147 | 57 | `'-' is not preceded with whitespace.` |
| 148 | 52 | `'+' is not followed by whitespace.` |
| 148 | 52 | `'+' is not preceded with whitespace.` |
| 149 | 52 | `'+' is not followed by whitespace.` |
| 149 | 52 | `'+' is not preceded with whitespace.` |
| 149 | 57 | `'+' is not followed by whitespace.` |
| 149 | 57 | `'+' is not preceded with whitespace.` |
### `ALGraph.java`
| Line | Column | Message |
| ---- | ------ | ------- |
| 1 | None | `File does not end with a newline.` |
| 11 | None | `Line is longer than 120 characters (found 127).` |
| 16 | 7 | `Found a TODO or FIXME comment` |
| 72 | 13 | `'if' is not followed by whitespace.` |
| 72 | 13 | `'if' is not followed by whitespace.` |
| 72 | 33 | `'&&' is not followed by whitespace.` |
| 72 | 33 | `'&&' is not preceded with whitespace.` |
| 72 | 53 | `'{' is not preceded with whitespace.` |
| 74 | 13 | `'}' is not followed by whitespace.` |
| 74 | 14 | `'else' is not preceded with whitespace.` |
| 74 | 19 | `'if' is not followed by whitespace.` |
| 74 | 19 | `'if' is not followed by whitespace.` |
| 74 | 39 | `'&&' is not followed by whitespace.` |
| 74 | 39 | `'&&' is not preceded with whitespace.` |
| 74 | 59 | `'{' is not preceded with whitespace.` |
| 82 | 1 | `Comment has incorrect indentation level 0, expected is 8, indentation should be the same level as line 83.` |
| 89 | 21 | `';' is preceded with whitespace.` |
| 92 | 9 | `'for' is not followed by whitespace.` |
| 92 | 9 | `'for' is not followed by whitespace.` |
| 93 | 9 | `'{' at column 9 should be on the previous line.` |
| 160 | 1 | `Comment has incorrect indentation level 0, expected is 12, indentation should be the same level as line 161.` |
| 163 | 13 | `'for' is not followed by whitespace.` |
| 163 | 13 | `'for' is not followed by whitespace.` |
| 163 | 27 | `'{' is not preceded with whitespace.` |
| 164 | 17 | `'if' is not followed by whitespace.` |
| 164 | 17 | `'if' is not followed by whitespace.` |
| 164 | 36 | `'{' is not preceded with whitespace.` |
| 219 | 9 | `switch without "default" clause.` |
| 229 | 50 | `',' is not followed by whitespace.` |
| 229 | 61 | `'-' is not followed by whitespace.` |
| 229 | 61 | `'-' is not preceded with whitespace.` |
| 240 | 9 | `switch without "default" clause.` |
| 279 | 17 | `'if' is not followed by whitespace.` |
| 279 | 17 | `'if' is not followed by whitespace.` |
| 279 | 46 | `'{' is not preceded with whitespace.` |
| 281 | 17 | `'}' is not followed by whitespace.` |
| 281 | 18 | `'else' is not followed by whitespace.` |
| 281 | 18 | `'else' is not followed by whitespace.` |
| 281 | 18 | `'else' is not preceded with whitespace.` |
| 281 | 22 | `'{' is not preceded with whitespace.` |
| 334 | 17 | `'if' is not followed by whitespace.` |
| 334 | 17 | `'if' is not followed by whitespace.` |
| 334 | 46 | `'{' is not preceded with whitespace.` |
| 336 | 17 | `'}' is not followed by whitespace.` |
| 336 | 18 | `'else' is not followed by whitespace.` |
| 336 | 18 | `'else' is not followed by whitespace.` |
| 336 | 18 | `'else' is not preceded with whitespace.` |
| 336 | 22 | `'{' is not preceded with whitespace.` |
| 421 | 14 | `',' is not followed by whitespace.` |
| 423 | 13 | `'if' is not followed by whitespace.` |
| 423 | 13 | `'if' is not followed by whitespace.` |
| 423 | 30 | `'{' is not preceded with whitespace.` |
| 425 | 17 | `'if' is not followed by whitespace.` |
| 425 | 17 | `'if' is not followed by whitespace.` |
| 425 | 31 | `',' is not followed by whitespace.` |
| 425 | 55 | `'<' is not followed by whitespace.` |
| 425 | 55 | `'<' is not preceded with whitespace.` |
| 425 | 62 | `'{' is not preceded with whitespace.` |
| 427 | 31 | `',' is not followed by whitespace.` |
| 441 | 17 | `'if' is not followed by whitespace.` |
| 441 | 17 | `'if' is not followed by whitespace.` |
| 441 | 33 | `'&&' is not followed by whitespace.` |
| 441 | 33 | `'&&' is not preceded with whitespace.` |
| 441 | 61 | `',' is not followed by whitespace.` |
| 441 | 64 | `',' is not followed by whitespace.` |
| 441 | 88 | `',' is not followed by whitespace.` |
| 441 | 112 | `'>' is not followed by whitespace.` |
| 441 | 112 | `'>' is not preceded with whitespace.` |
| 441 | 117 | `'{' is not preceded with whitespace.` |
| 442 | 53 | `',' is not followed by whitespace.` |
| 442 | 56 | `',' is not followed by whitespace.` |
| 442 | 80 | `',' is not followed by whitespace.` |
| 453 | 24 | `',' is not followed by whitespace.` |
| 457 | 17 | `'if' is not followed by whitespace.` |
| 457 | 17 | `'if' is not followed by whitespace.` |
| 457 | 33 | `'&&' is not followed by whitespace.` |
| 457 | 33 | `'&&' is not preceded with whitespace.` |
| 457 | 61 | `',' is not followed by whitespace.` |
| 457 | 64 | `',' is not followed by whitespace.` |
| 457 | 88 | `',' is not followed by whitespace.` |
| 457 | 112 | `'<' is not followed by whitespace.` |
| 457 | 112 | `'<' is not preceded with whitespace.` |
| 457 | 117 | `'{' is not preceded with whitespace.` |
| 458 | 53 | `',' is not followed by whitespace.` |
| 458 | 56 | `',' is not followed by whitespace.` |
| 458 | 80 | `',' is not followed by whitespace.` |
| 461 | 23 | `',' is not followed by whitespace.` |
| 475 | None | `Line is longer than 120 characters (found 131).` |
### `AMGraph.java`
| Line | Column | Message |
| ---- | ------ | ------- |
| 11 | None | `Line is longer than 120 characters (found 127).` |
| 117 | None | `Line is longer than 120 characters (found 142).` |
| 189 | 9 | `'{' at column 9 should be on the previous line.` |
| 195 | 9 | `'}' at column 9 should be alone on a line.` |
| 195 | 9 | `'}' is not followed by whitespace.` |
| 195 | 10 | `'return' is not preceded with whitespace.` |
| 207 | 32 | `';' is preceded with whitespace.` |
| 208 | 9 | `'if' is not followed by whitespace.` |
| 208 | 9 | `'if' is not followed by whitespace.` |
| 208 | 22 | `',' is not followed by whitespace.` |
| 209 | 9 | `'{' at column 9 should be on the previous line.` |
| 224 | 5 | `'{' at column 5 should be on the previous line.` |
| 225 | 9 | `'if' is not followed by whitespace.` |
| 225 | 9 | `'if' is not followed by whitespace.` |
| 226 | 9 | `'{' at column 9 should be on the previous line.` |
| 242 | 5 | `'{' at column 5 should be on the previous line.` |
| 243 | 9 | `'if' is not followed by whitespace.` |
| 243 | 9 | `'if' is not followed by whitespace.` |
| 243 | 22 | `',' is not followed by whitespace.` |
| 244 | 9 | `'{' at column 9 should be on the previous line.` |
| 256 | 5 | `'{' at column 5 should be on the previous line.` |
| 284 | 5 | `'{' at column 5 should be on the previous line.` |
| 340 | 9 | `switch without "default" clause.` |
| 349 | 50 | `',' is not followed by whitespace.` |
| 349 | 61 | `'-' is not followed by whitespace.` |
| 349 | 61 | `'-' is not preceded with whitespace.` |
| 422 | 9 | `switch without "default" clause.` |
| 438 | 5 | `'{' at column 5 should be on the previous line.` |
| 441 | 9 | `'{' at column 9 should be on the previous line.` |
| 445 | 13 | `'{' at column 13 should be on the previous line.` |
| 480 | 24 | `',' is not followed by whitespace.` |
| 484 | 17 | `'if' is not followed by whitespace.` |
| 484 | 17 | `'if' is not followed by whitespace.` |
| 484 | 33 | `'&&' is not followed by whitespace.` |
| 484 | 33 | `'&&' is not preceded with whitespace.` |
| 484 | 61 | `',' is not followed by whitespace.` |
| 484 | 64 | `',' is not followed by whitespace.` |
| 484 | 88 | `',' is not followed by whitespace.` |
| 484 | 112 | `'<' is not followed by whitespace.` |
| 484 | 112 | `'<' is not preceded with whitespace.` |
| 484 | 117 | `'{' is not preceded with whitespace.` |
| 485 | 53 | `',' is not followed by whitespace.` |
| 485 | 56 | `',' is not followed by whitespace.` |
| 485 | 80 | `',' is not followed by whitespace.` |
| 488 | 23 | `',' is not followed by whitespace.` |
| 493 | 5 | `'{' at column 5 should be on the previous line.` |
### `Edge.java`
| Line | Column | Message |
| ---- | ------ | ------- |
| 104 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
### `IGraph.java`
| Line | Column | Message |
| ---- | ------ | ------- |
### `PathCostType.java`
| Line | Column | Message |
| ---- | ------ | ------- |
### `Vertex.java`
| Line | Column | Message |
| ---- | ------ | ------- |
| 56 | 35 | `'name' hides a field.` |
### `GridLocation.java`
| Line | Column | Message |
| ---- | ------ | ------- |
| 4 | 22 | `Class member (field) 'row' may not be public.` |
| 5 | 22 | `Class member (field) 'col' may not be public.` |
| 13 | 9 | `'if' construct must use '{}'s.` |
| 20 | 16 | `'31' is a magic number.` |
### `SeaLevels.java`
| Line | Column | Message |
| ---- | ------ | ------- |
| 7 | 11 | `Found a TODO or FIXME comment` |
| 19 | 11 | `Found a TODO or FIXME comment` |
### `SeaLevelsGUI.java`
| Line | Column | Message |
| ---- | ------ | ------- |
| 83 | 45 | `'8' is a magic number.` |
| 134 | 38 | `'typecast' is not followed by whitespace.` |
| 145 | None | `Line is longer than 120 characters (found 140).` |
| 157 | 47 | `'typecast' is not followed by whitespace.` |
| 157 | 49 | `'100.0' is a magic number.` |
| 158 | 57 | `'20' is a magic number.` |
| 194 | 15 | `Catching 'Exception' is not allowed.` |
### `SeaLevelsVisualizer.java`
| Line | Column | Message |
| ---- | ------ | ------- |
| 27 | 26 | `Class member (field) 'red' may not be public.` |
| 27 | 31 | `Class member (field) 'green' may not be public.` |
| 27 | 38 | `Class member (field) 'blue' may not be public.` |
| 28 | 29 | `Class member (field) 'threshold' may not be public.` |
| 44 | 21 | `'(' is followed by whitespace.` |
| 44 | 41 | `')' is preceded with whitespace.` |
| 45 | 41 | `')' is preceded with whitespace.` |
| 47 | 41 | `')' is preceded with whitespace.` |
| 72 | 17 | `'if' construct must use '{}'s.` |
| 73 | 17 | `'if' construct must use '{}'s.` |
| 78 | 41 | `'flooded' hides a field.` |
| 87 | 45 | `'0.000001' is a magic number.` |
| 92 | 9 | `'if' construct must use '{}'s.` |
| 105 | 69 | `'/' should be on a new line.` |
| 126 | 9 | `'if' construct must use '{}'s.` |
| 132 | 37 | `'typecast' is not followed by whitespace.` |
| 137 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 143 | 25 | `'typecast' is not followed by whitespace.` |
| 144 | 25 | `'typecast' is not followed by whitespace.` |
### `Terrain.java`
| Line | Column | Message |
| ---- | ------ | ------- |
| 6 | 23 | `Class member (field) 'heights' may not be public.` |
| 7 | 27 | `Class member (field) 'sources' may not be public.` |
### `TerrainLoader.java`
| Line | Column | Message |
| ---- | ------ | ------- |
| 11 | 29 | `'{' is not followed by whitespace.` |
| 11 | 30 | `'}' is not preceded with whitespace.` |
| 32 | 46 | `'?' is not preceded with whitespace.` |
| 42 | 50 | `'{' is not preceded with whitespace.` |
| 43 | 13 | `'if' is not followed by whitespace.` |
| 43 | 13 | `'if' is not followed by whitespace.` |
| 48 | 30 | `'typecast' is not followed by whitespace.` |
| 48 | 32 | `'100.0' is a magic number.` |
| 75 | 9 | `'if' construct must use '{}'s.` |
| 88 | 14 | `'if' child has incorrect indentation level 13, expected level should be 12.` |
| 148 | None | `Line is longer than 120 characters (found 133).` |
### `In.java`
| Line | Column | Message |
| ---- | ------ | ------- |
| 71 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 74.` |
| 79 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 86.` |
| 87 | 9 | `'if' construct must use '{}'s.` |
| 92 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 98 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 105.` |
| 106 | 9 | `'if' construct must use '{}'s.` |
| 112 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 118 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 125.` |
| 126 | 9 | `'if' construct must use '{}'s.` |
| 133 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 140 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 148.` |
| 149 | 9 | `'if' construct must use '{}'s.` |
| 184 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 201 | 9 | `'if' construct must use '{}'s.` |
| 217 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 225.` |
| 229 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 238.` |
| 258 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 263.` |
| 267 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 288 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 296 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 301.` |
| 302 | 9 | `'if' construct must use '{}'s.` |
| 312 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 318.` |
| 321 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 328 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 336.` |
| 339 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 344 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 351 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 359.` |
| 362 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 367 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 374 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 382.` |
| 385 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 390 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 397 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 405.` |
| 408 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 413 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 420 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 428.` |
| 431 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 436 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 443 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 453.` |
| 456 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 461 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 480 | 13 | `'if' construct must use '{}'s.` |
| 481 | 13 | `'if' construct must use '{}'s.` |
| 482 | 13 | `'if' construct must use '{}'s.` |
| 483 | 13 | `'if' construct must use '{}'s.` |
| 486 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 503 | 9 | `'if' construct must use '{}'s.` |
| 505 | 57 | `'-' is not followed by whitespace.` |
| 505 | 57 | `'-' is not preceded with whitespace.` |
| 506 | 9 | `'for' construct must use '{}'s.` |
| 506 | 42 | `'-' is not followed by whitespace.` |
| 506 | 42 | `'-' is not preceded with whitespace.` |
| 507 | 39 | `'+' is not followed by whitespace.` |
| 507 | 39 | `'+' is not preceded with whitespace.` |
| 535 | 9 | `'for' construct must use '{}'s.` |
| 549 | 9 | `'for' construct must use '{}'s.` |
| 563 | 9 | `'for' construct must use '{}'s.` |
| 570 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 573.` |
| 590 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 598.` |
| 603 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 611.` |
| 628 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 635.` |
| 640 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 647.` |
| 652 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 657.` |
| 667 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 682 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 697 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 713 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 728 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
### `StdOut.java`
| Line | Column | Message |
| ---- | ------ | ------- |
| 63 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 72 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 78.` |
| 83 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 86.` |
| 90 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 95.` |
| 99 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 104.` |
| 108 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 113.` |
| 117 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 122.` |
| 126 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 131.` |
| 135 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 140.` |
| 144 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 149.` |
| 153 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 158.` |
| 162 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 169.` |
| 173 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 176.` |
| 180 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 185.` |
| 190 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 195.` |
| 200 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 205.` |
| 210 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 215.` |
| 220 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 225.` |
| 230 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 235.` |
| 240 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 245.` |
| 250 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 255.` |
| 260 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 265.` |
| 270 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 278.` |
| 275 | None | `Line is longer than 120 characters (found 127).` |
| 283 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 291.` |
| 288 | None | `Line is longer than 120 characters (found 127).` |
| 296 | 4 | `Block comment has incorrect indentation level 3, expected is 4, indentation should be the same level as line 301.` |
| 304 | 24 | `'17' is a magic number.` |
| 306 | 36 | `'/' is not followed by whitespace.` |
| 306 | 36 | `'/' is not preceded with whitespace.` |
| 306 | 37 | `'7.0' is a magic number.` |
### `StdRandom.java`
| Line | Column | Message |
| ---- | ------ | ------- |
| 119 | 9 | `'if' construct must use '{}'s.` |
| 132 | 9 | `'if' construct must use '{}'s.` |
| 145 | 27 | `Inner assignments should be avoided.` |
| 195 | 34 | `'-' is not followed by whitespace.` |
| 195 | 34 | `'-' is not preceded with whitespace.` |
| 208 | 9 | `'if' construct must use '{}'s.` |
| 236 | 18 | `'*' is not followed by whitespace.` |
| 236 | 18 | `'*' is not preceded with whitespace.` |
| 236 | 24 | `'*' is not followed by whitespace.` |
| 236 | 24 | `'*' is not preceded with whitespace.` |
| 238 | 30 | `'-2' is a magic number.` |
| 288 | 9 | `'if' construct must use '{}'s.` |
| 290 | 9 | `'if' construct must use '{}'s.` |
| 301 | 17 | `'-' is not followed by whitespace.` |
| 301 | 17 | `'-' is not preceded with whitespace.` |
| 323 | 9 | `'if' construct must use '{}'s.` |
| 325 | 44 | `'/' is not followed by whitespace.` |
| 325 | 44 | `'/' is not preceded with whitespace.` |
| 348 | 9 | `'if' construct must use '{}'s.` |
| 349 | 16 | `Local variable 'EPSILON' must be in camelCase, or consist of a single upper-case letter.` |
| 349 | 26 | `'1E-14' is a magic number.` |
| 352 | 13 | `'if' construct must use '{}'s.` |
| 356 | 9 | `'if' construct must use '{}'s.` |
| 366 | 17 | `'if' construct must use '{}'s.` |
| 383 | 9 | `'if' construct must use '{}'s.` |
| 386 | 13 | `'if' construct must use '{}'s.` |
| 390 | 9 | `'if' construct must use '{}'s.` |
| 392 | 9 | `'if' construct must use '{}'s.` |
| 400 | 13 | `'if' construct must use '{}'s.` |
| 418 | 9 | `'if' construct must use '{}'s.` |
| 433 | 34 | `'-' is not followed by whitespace.` |
| 433 | 34 | `'-' is not preceded with whitespace.` |
| 450 | 34 | `'-' is not followed by whitespace.` |
| 450 | 34 | `'-' is not preceded with whitespace.` |
| 467 | 34 | `'-' is not followed by whitespace.` |
| 467 | 34 | `'-' is not preceded with whitespace.` |
| 484 | 34 | `'-' is not followed by whitespace.` |
| 484 | 34 | `'-' is not preceded with whitespace.` |
| 506 | 35 | `'-' is not followed by whitespace.` |
| 5
