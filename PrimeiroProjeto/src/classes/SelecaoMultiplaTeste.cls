@isTest
private class SelecaoMultiplaTeste {

    static testMethod void myUnitTest() {

    }
    
    static testMethod void addContatoInteresseNull() {
        Contact c = new Contact();
        
        c.lastName = 'Silva';
        
        Test.startTest();
        Database.SaveResult sr = Database.insert(c, false);
        Test.stopTest();
        
        System.assert(sr.isSuccess(), 'Contato não criado');
    }
    
    static testMethod void addContatoInteresseOk() {
        Contact c = new Contact();
        
        c.lastName = 'Silva';
        c.Interesse__c = 'Interesse 1;Interesse 2;Interesse ';
        
        Test.startTest();
        Database.SaveResult sr = Database.insert(c, false);
        Test.stopTest();
        
        System.assert(sr.isSuccess(), 'Contato não criado');
    }
    
    static testMethod void addContatoInteresseMenor() {
        Contact c = new Contact();
        
        c.lastName = 'Silva';
        c.Interesse__c = 'Interesse 1;Interesse 2';
        
        Test.startTest();
        Database.SaveResult sr = Database.insert(c, false);
        Test.stopTest();
        
        System.assert(sr.isSuccess(), 'Contato não criado');
    }
}