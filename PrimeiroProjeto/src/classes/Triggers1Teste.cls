@isTest
private class Triggers1Teste {

    static testMethod void insertOk() {
        Account a = new Account(Name='Test Account', AccountNumber='AAAAA', CNPJ__c='99.999.999/5555-66');		
        
        Test.startTest();
        Database.SaveResult sr = Database.insert(a, false);
        Test.stopTest();
        
        System.assert(sr.isSuccess(), 'Conta não criada');
    }
    
    static testMethod void insertNull() {
        Account a = new Account(Name='Test Account afafaffa', CNPJ__c='99.999.999/5555-66');		
        
        Test.startTest();
        Database.SaveResult sr = Database.insert(a, false);
        Test.stopTest();
        System.assertEquals(sr.getErrors()[0].getMessage(), 'Conta não criada', 'Conta criada');	
    }
    
    static testMethod void insertMenor() {
        Account a = new Account(Name='Test Account afafaffa', AccountNumber='AAAA', CNPJ__c='99.999.999/5555-66');		
        
        Test.startTest();
        Database.SaveResult sr = Database.insert(a, false);
        Test.stopTest();
        
        System.assert(sr.isSuccess(), 'Conta não criada');	
    }
    
    static testMethod void insertMaior() {
        List<Account> contaList = New List<Account>();
        Account a;
        
        for(Integer i=0; i<200; i++){
            a = new Account(Name='Teste Conta'+i, AccountNumber='AAAAA', CNPJ__c='99.999.999/5555-66');
            contaList.add(a);
        }
        
        Test.startTest();
        List<Database.SaveResult> listSaveResult = Database.insert(contaList, false);
        Test.stopTest();	
        
        for(Database.SaveResult r : listSaveResult){
            System.assert(r.isSuccess(), 'Conta não criada');
        }
    }
 
}