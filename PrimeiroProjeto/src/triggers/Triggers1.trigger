trigger Triggers1 on Account (before insert) {

   for(Account a : Trigger.new){
       
       if( a.AccountNumber != null && a.AccountNumber.length() < 5){
           a.AccountNumber.addError('Não pode ser menor que 5');
       }
       
   }

    
}