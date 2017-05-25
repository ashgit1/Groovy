import groovy.text.* 
import java.io.* 

def file = new File("./Student.template") 
def binding = ['name' : 'Ashish', 'id' : 1, 'subject' : 'Physics']
				  
def engine = new SimpleTemplateEngine() 
def template = engine.createTemplate(file) 
def writable = template.make(binding) 

println writable
