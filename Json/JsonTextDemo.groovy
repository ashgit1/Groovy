import groovy.json.JsonSlurper;

class JsonTextDemo{
	static void main(String[] args){
		def jsonSlurper = new JsonSlurper();
		def object = jsonSlurper.parseText('{"name" : "Ashish", "id" : "101"}');

		println("Name: " + object.name);
		println("ID: " + object.id);
	}
}