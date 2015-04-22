@isTest
private class ContaExtTest {

    private Account a;
    private Opportunity oportunidade1;
    private Opportunity oportunidade2;
    
    public ContaExtTest(){
        Account a = new Account(Name='Test Account',
        						CNPJ__c='99.999.999/5555-66');
        						
        insert a;
        
        Opportunity oportunidade1 = new Opportunity();
        oportunidade1.Name = 'Classe de teste1';
        oportunidade1.AccountId = a.Id;
        oportunidade1.Amount = 5000;
        oportunidade1.CloseDate = System.today();
        
        insert oportunidade1;
        
        Opportunity oportunidade2 = new Opportunity();
        oportunidade2.Name = 'Classe teste2';
        oportunidade2.AccountId = a.Id;
        oportunidade2.Amount = 10000;
        oportunidade2.CloseDate = System.today();
        
        insert oportunidade2;
        
        
    }
    
    static testMethod void myUnitTest() {
        
    }

}