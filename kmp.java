class KMP
{ 
    void KMPSearch(String pat, String txt) 
    { 
        int M = pat.length(); 
        int N = txt.length(); 
        int lps[] = new int[M]; 
        int j = 0;
        computeLPSArray(pat, M, lps); 
  
        int i = 0; 
        while (i < N)
         { 
            if (pat.charAt(j) == txt.charAt(i)) { 
                j++; 
                i++; 
            } 
            if (j == M) { 
                System.out.println(i-j);
                j = lps[j - 1]; 
            } 
            else if (i < N && pat.charAt(j) != txt.charAt(i)) { 
                if (j != 0) 
                    j = lps[j - 1]; 
                else
                    i = i + 1; 
            } 
        } 
    } 
  
    void computeLPSArray(String pat, int M, int lps[]) 
    { 
        int j =0; 
        int i = 1; 
        lps[0] = 0; // lps[0] is always 0 
        while (i < M) 
        { 
            if (pat.charAt(i) == pat.charAt(j)) { 
                j++; 
                lps[i] = j; 
                i++; 
            } 
            else
            { 
                if (j != 0) { 
                    j = lps[j - 1]; 
                } 
                else
                { 
                    lps[i] = j; 
                    i++; 
                } 
            } 
        } 
    } 
  