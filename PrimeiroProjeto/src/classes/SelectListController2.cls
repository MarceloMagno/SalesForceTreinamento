public class SelectListController2 {
 
 	public String sv { get; set; }
    
    public String getIddisplay() 
    {
        return null;
    }


    public List<SelectOption> getValue(){
         
         List<SelectOption> options = new List<selectOption>(); 
  
  		 Schema.sObjectType sobject_type = Account.getSObjectType();
		  
		  Schema.DescribeSObjectResult sobject_describe = sobject_type.getDescribe();
		  Map<String, Schema.SObjectField> field_map = sobject_describe.fields.getMap(); 
		  
		  List<Schema.PicklistEntry> pick_list_values = field_map.get('rating').getDescribe().getPickListValues(); 
		  
		  for (Schema.PicklistEntry a : pick_list_values) { 
		   options.add(new selectOption(a.getLabel(), a.getValue()));  
		  }
		 
         return options;      
    }
}