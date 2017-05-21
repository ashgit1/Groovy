import groovy.xml.MarkupBuilder

class MarkupBuilderDemo{
	static void main(String[] args){

		def mb = new MarkupBuilder();

		//compose the builder
		mb.collection(shelf : 'New Arrivals'){
			movie(title : 'Enemy Behind')
			type('War, Thriller')
			format('DVD')
			year('2003')
			rating('PG')
			stars(10)
			description('Talk about US-Japan War')
		}	
	}
}