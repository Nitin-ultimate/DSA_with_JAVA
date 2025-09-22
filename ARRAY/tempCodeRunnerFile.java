 for(int i=0; i<n-1;i++) {
            int max = Integer.MIN_VALUE;
            for(int j=i+1; j<n;j++){
                max = Math.max(max,a[j]);
            }
            b[i] = max;
        }