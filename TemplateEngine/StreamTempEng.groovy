def text = '''This Tutorial is <% out.print TutorialName %> The Topic name is ${TopicName}''' 
def template = new groovy.text.StreamingTemplateEngine().createTemplate(text)
  
def binding = [TutorialName : "Groovy", TopicName  : "Templates",]
String response = template.make(binding) 
println(response)