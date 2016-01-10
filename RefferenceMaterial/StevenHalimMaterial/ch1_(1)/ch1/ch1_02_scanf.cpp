#include <stdio.h>
long long n,k,count=0,m;
int main() {
  scanf("%lld", &n);
  scanf("%lld", &k);
  while (n>0) {
    scanf("%d", &m);
    if(m%k==0){
        count++ ;
    }
    n--;
  }
  printf("%lld", count);
  return 0;
}
