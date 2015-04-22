public class ContaExt {

 	private final Account conta;
    
    public ContaExt(ApexPages.StandardController stdController) {
        this.conta = (Account)stdController.getRecord();
    }

    public Object getTotalOportunidades() {
     	AggregateResult[] groupedResults = [SELECT SUM(Amount) amount FROM Opportunity 
      		WHERE Account.id = :ApexPages.currentPage().getParameters().get('id')];
     
 		Object avgAmount = groupedResults[0].get('amount');
     
        return avgAmount;
    }
    
    public Integer getTotalOportunidadesAbertas() {
     Integer total = [SELECT COUNT() FROM Opportunity 
      WHERE Account.id = :ApexPages.currentPage().getParameters().get('id') AND
       isClosed = false];
       
      return total;
    }
    
    public Integer getTotalOportunidadesGanhas() {
     Integer total = [SELECT COUNT() FROM Opportunity 
      WHERE Account.id = :ApexPages.currentPage().getParameters().get('id') AND
       isWon = true];
         
        return total;
    }

 	public Integer getTotalOportunidadesPerdidas() {
     
     Integer total = [SELECT COUNT() FROM Opportunity 
      WHERE Account.id = :ApexPages.currentPage().getParameters().get('id') AND
       isWon = false AND isClosed = true];
         
        return total;
    }
    
    public Integer getOportunidadesAbertas() {
        return [SELECT COUNT() FROM Opportunity WHERE Account.id = :ApexPages.currentPage().getParameters().get('id') AND isClosed = false];
    }
 	
 	public Integer getTotalOportunidadesGanhasPerdidas() {
        return getTotalOportunidadesGanhas() + getOportunidadesAbertas();
    }
 
}