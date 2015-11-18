// Jun 24 2015, minsu( github : https://github.com/minsuu/ )
#include <bits/stdc++.h>
using namespace std;
const long long MAXN = 1000007;
long long sieve[MAXN], phi[MAXN];
long long phisum[MAXN];
int main(){
	for(long long i=2; i*i<MAXN; i++){
		if( sieve[i] != 0 ) continue;
		for(long long j=i; j<MAXN; j+=i)
			sieve[j] = i;
	}
	phi[1] = 1;
	// phi(x^p) = (x-1)*x^(p-1) : http://oeis.org/A000010
	for(long long i=2; i<MAXN; i++){
		if( sieve[i] == 0 ) phi[i] = i-1, sieve[i] = i;
		else{
			long long x = sieve[i], j = i/x, p = 1;
			while( j%x == 0 ) j/=x, p*=x;
			phi[i] = phi[j] * (x-1) * p;
		}
	}
	// phisum(x) = sum{d|n} d*phi(d) : http://oeis.org/A057660
	for(long long i=1; i<MAXN; i++)
		for(long long j=i; j<MAXN; j+=i)
			phisum[j] += i * 1LL * phi[i];
	long long N=0,T;
	scanf("%lld",&T);
	// sum{k=1..n} LCM(n,k) = n*(1+phisum(n))/2 : http://oeis.org/A051193
	while(T--){
		scanf("%lld",&N);
		//printf("%lld\n", N*(1+phisum[N])/2 );
		printf("%lld\n", (phisum[N]));

	}
	return 0;
}
