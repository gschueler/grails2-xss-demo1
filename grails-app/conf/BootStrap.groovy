import xtest1.Item
class BootStrap {

    def init = { servletContext ->
    	if(Item.count()<1){
	    	new Item(name:'Basic item', value:'basic value').save()
	    	new Item(name: "asdf\"></option></select><script>alert('hi')</script>",value:"vulnerable").save()
	    	println "Created 2 Items"
	    }
    }
    def destroy = {
    }
}
