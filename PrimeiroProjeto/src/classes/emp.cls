public class emp {
    Integer id;
    String nome;
    double bs;
    
    public emp(){
        
    }
    
    public void disp(){
        system.debug('Id....: '+id);
        system.debug('Nome ....: '+nome+' Employ Basic....: '+bs);
    }
    
    public void dispX(Integer codigo, String n, double bsX){
        id = codigo;
        n = nome;
        bs = bsX;
        
        system.debug('Id....: '+id);
        system.debug('Nome ....: '+nome+' Employ Basic....: '+bs);
    }
}