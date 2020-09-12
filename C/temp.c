#include <stdio.h>
int main()
{
	int i,j,sum;
	int counter=0, arr[7]={1,2,3,4,5,6,7};

	for ( i=0; i<3; i++ ){
		for ( j=0; j<3; j++ ){
			if ( (i+j)%2 == 0 || i == 0 || i == 2 ){
				printf("%d", arr[counter]);
				counter++;
			}
		}
		printf("\n");
	}	


	 
    return 0; 
}
