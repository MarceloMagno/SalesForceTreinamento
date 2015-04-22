public class ControllerCuston {
	
	public Account account;
	public List<Opportunity> opportunities;

	public ControllerCuston() {
       account = [SELECT Id, Name, AccountNumber FROM Account 
                   WHERE Id = :ApexPages.currentPage().getParameters().get('id')];
   	}

	public Account getAccount() {
        return account;
    }
    
    public List<Opportunity> getOpportunities() {
        if(opportunities == null) {
    		  opportunities = [SELECT Id, Name, Amount FROM Opportunity WHERE Amount > 10000 
		     			AND Account.Id = :ApexPages.currentPage().getParameters().get('id')] ;
   		}
     return opportunities; 
    }

    public PageReference save() {
        update account;
        return null;
    }
}