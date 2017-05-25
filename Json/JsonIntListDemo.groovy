import groovy.json.JsonSlurper 

class JsonIntListDemo {
   static void main(String[] args) {
   	def jsonSlurper = new JsonSlurper()
	Object lst = jsonSlurper.parseText('{ "List": [2, 3, 4, 5] }')
	lst.each { 
		println it 
		}
	} 
}