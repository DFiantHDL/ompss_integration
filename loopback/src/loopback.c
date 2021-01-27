#include <stdio.h>

#pragma omp target device(fpga) copy_deps
#pragma omp task in([size]o) out([size]d)
void loopback(int * d, int * o, int size)
{
   int i = 0;
   while (i<size) { d[i] = o[i]; ++i; }
}

#define SIZE 1024

int main(int argc, char * argv[])
{
   int size = SIZE;
   int orig[SIZE];
   int dest[SIZE];

   int i;
   for (i=0; i < 1024; i++) {
      orig[i] = i+1;
      dest[i] = 0;
   }

   loopback(dest, orig, SIZE);

#pragma omp taskwait

   for (i=0; i < 1024; i++) {
      if (orig[i] != dest[i]) printf("Error %d  %d -> %d\n", i, orig[i], dest[i]);
   }

   return 0;
}
