#include <stdio.h>
int main()
{
int n, i,factorial = 1;
printf("Enter an integer: ");
scanf("%d",&n);
for(i=1;i<=n;i++)
{
factorial = factorial*i;
}
printf("Factorial of %d = %d", n, factorial);
return 0;
}
