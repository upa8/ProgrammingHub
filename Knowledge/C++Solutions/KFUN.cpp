// Codechef : NOV 15
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <cstring>
#include <complex>

#include <iostream>
#include <algorithm>
#include <vector>
#include <map>
#include <set>
#include <queue>
#include <stack>
#include <string>
using namespace std;

#define N 1000000 /* Max Array Size */

int F(long long int num)
{
    /*
    long long int k = (num - 1) / 9;
    long long int res =(num - (k * 9));

	return res;
	*/

	long long int res = 0;
	while(num > 0)
	{
		res += (num%10);
		num = num/10;
	}
	if(res >= 10) return F(res);
	else return res;

}

int main(void)
{

	long long int t,a,d,l,r,res;

	int arr[9],i;

	scanf("%lld",&t);

	while(t-- && scanf("%lld%lld%lld%lld",&a,&d,&l,&r)==4)
	{
		res = 0;
		for(i = 0; i < 9; ++i)
		{
			arr[i] = F((a+(i*d)));
            printf("%d ",arr[i]);
		}

        printf("\n RES %lld ",res);

		res += ((int)((r - l)/9)*45);

		printf("\n RES %lld ",res);


		if(l%9 != r%9)
		{
			if(l%9 < r%9)
			{
				for (i = l%9; i <= r%9; i++)
				{
					res += arr[i-1];
				}
			}
			else
			{
				for (i = l%9; i <= 9; i++)
				{
					res += arr[i-1];
				}
				for (i = 0; i <= r%9; i++) {
					res += arr[i-1];
				}
			}
		}
		printf("%lld\n",res);
	}
	return 0;
}
