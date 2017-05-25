def text ='This Tutorial focuses on $TutorialName. In this tutorial you will learn about $Topic'  

def binding = ["TutorialName":"Groovy", "Topic":"Templates"]  
def engine = new groovy.text.SimpleTemplateEngine() 
def template = engine.createTemplate(text).make(binding) 

println template