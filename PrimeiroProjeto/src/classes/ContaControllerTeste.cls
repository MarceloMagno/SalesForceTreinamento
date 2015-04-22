@isTest
private class ContaControllerTeste {

    static testMethod void myUnitTest() {
    	ContaController contaController = new ContaController();
    	
        Account a = new Account(Name='Test Account', CNPJ__c='99.999.999/5555-66');
        contaController.setAccount(a);
        insert a;  
        
        Account insertedAcct = [SELECT Id,Name FROM Account WHERE Name='Test Account'];
                                
        System.assert(insertedAcct != null);
        //System.assert(contaController.getAccount() != null);
    }
}