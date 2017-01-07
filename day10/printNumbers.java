
void printNumbers(int n) {
	if (n <= 0) {
		return;
	}
	printNumbers(n);
	printNumbers(n-2);
	printNumbers(n-3);
	printNumbers(n);
}