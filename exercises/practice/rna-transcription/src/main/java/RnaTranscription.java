class RnaTranscription {

    String transcribe(String dnaStrand) {
        int pos, len;
        len=dnaStrand.length();
        StringBuilder rnaStrand= new StringBuilder();
        for(pos=0;pos<len;pos++)
            {
                if(dnaStrand.charAt(pos)=='G')
                {
                    rnaStrand.append('C');
                }
                if(dnaStrand.charAt(pos)=='C')
                {
                    rnaStrand.append('G');
                }
                if(dnaStrand.charAt(pos)=='T')
                {
                    rnaStrand.append('A');
                }
                if(dnaStrand.charAt(pos)=='A')
                {
                    rnaStrand.append('U');
                }
            }
        return rnaStrand.toString();
    }

}
