/*
 * Runs in about 4.5 minutes using string reversal of number and
 * takes 1 minute using arithmetic wizardry.
 */
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <stdbool.h>

bool is_reversible(int n);
bool is_reversible_two(int n);
bool is_odd_digits(int n);
char *str_rev(char *str, int len);
int reverse_digits(int n);

int main()
{
	int count = 0;

	for (int i = 0; i < 1000000000; i++) {
		if (is_reversible_two(i))
			count++;
	}
	printf("%d\n", count);

	return 0;
}

bool is_reversible(int n)
{
	int length = snprintf(NULL, 0, "%d", n);
	char *str = malloc(length + 1);
	snprintf(str, length + 1, "%d", n);

	str = str_rev(str, length);

	if (str[0] == '0') {
		free(str);
		return false;
	}

	char *ptr;
	bool result = is_odd_digits(n + strtol(str, &ptr, 10));

	free(str);
	return result;
}

bool is_odd_digits(int n)
{
	while (n > 0) {
		if ((n % 10) % 2 == 0)
			return false;

		n = n / 10;
	}

	return true;
}

char *str_rev(char *str, int len)
{
	char *p1 = str;
	char *p2 = str + len - 1;

	while (p1 < p2) {
		char tmp = *p1;
		*p1++ = *p2;
		*p2-- = tmp;
	}

	return str;
}

int reverse_digits(int n)
{
	int rev = 0;

	while (n > 0) {
		rev = rev * 10 + n % 10;
		n = n / 10;
	}

	return rev;
}

bool is_reversible_two(int n)
{
	if (n % 10 == 0)
		return false;

	return is_odd_digits(n + reverse_digits(n));
}
