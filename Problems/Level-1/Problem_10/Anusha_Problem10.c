#include <stdio.h> 

int main() { 
    int n;
    scanf("%d", &n);
    
    int a[n];
    for (int i = 0; i < n; i++)
        scanf ("%d", &a[i]);
    

    int tp;
    
    for (int i = 0; i < n; i++){ 
        
        for (int j = 0; j < n; j++){ 
            
            if (a[i] < a[j]){
                
                tp = a[i];
                a[i] = a[j];
                a[j] = tp;
            }
        }
    }
    
    for (int i = 0; i < n; i++)
        printf ("%d ", a[i]);

}