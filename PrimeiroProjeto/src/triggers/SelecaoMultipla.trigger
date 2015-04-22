trigger SelecaoMultipla on Contact (before insert) {
    
    for(Contact c : Trigger.new){   
        system.debug('Nome....: '+c.Name);
        if(c.Interesse__c != null){
            
            String[] tmpString = c.Interesse__c.split(';');
            
            if (tmpString.isEmpty() && tmpString.size() < 3){
                c.Interesse__c.addError('Selecione no mínimo três interesses.'); 
            } 
        }
        
    }
    
}