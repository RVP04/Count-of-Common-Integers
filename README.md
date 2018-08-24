# Count of Common Integers
<p>The program must accept an integer matrix of size <strong>NxN</strong> as input. The program must print the count of common integers between top right and bottom left submatrices of the given matrix.&nbsp;</p>

<p><strong>Boundary Condition(s):</strong><br>
2 &lt;= N &lt;= 50</p>

<p><strong>Input Format:</strong><br>
The first line contains the value of N.<br>
The next N lines contain N integers each separated by space.</p>

<p><strong>Output Format:</strong><br>
The first line contains the count of common integers between top right and bottom left of the matrix.</p>

<p><strong>Example Input/Output 1:</strong><br>
Input:<br>
5<br>
1 2 3 4 2<br>
6 7 8 9 0<br>
1 2 3 4 5<br>
6 7 8 9 0<br>
9 2 3 4 5&nbsp;</p>

<p>Output:<br>
5</p>

<p>Explanation:<br>
The top right submatrix elements of the given matrix are 3 4 2 8 9 0 3 4 5.<br>
The bottom left submatrix elements of the given matrix are 1 2 3 6 7 8 9 2 3.<br>
The common integers between top right and bottom left submatrices of the given matrix are 2 3 3 8 and 9.<br>
Hence, the count 5 is printed as the output.</p>

<p><strong>Example Input/Output 2:</strong><br>
Input:<br>
4<br>
12 23 34 45<br>
23 34 12 56<br>
34 45 56 67<br>
12 23 34 45</p>

<p>Output:<br>
3</p>
