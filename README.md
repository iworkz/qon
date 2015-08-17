# Qualified Object Notation (QON)

Notation to describe object data (for storage and transport).


Goals:

* Simple and easy to read
* Efficient to parse and process
* Allow typed objects
* Allow referencing of objects


This notation is a tradeoff between XML/XSD and JSON/JsonSchema.



QON untyped sample:

	{	
		name: "Stephan"
		address: {
			street: "Peter-Jordan-Strasse"
			zip: "1180"
			city: "Vienna"
			country: "Austria"
		}
		pets: [ 
			{	
				name: "Timmy"
				breed: "Border Collie"
				dogTag: 12345678
			},
			{	
				name: "Tigger"
				breed: "British Shorthair"
			}
		]
	}
	
QON typed sample (QON schema reqired):
	
	Person {	
		name: "Stephan"
		address: {
			street: "Peter-Jordan-Strasse"
			zip: "1180"
			city: "Vienna"
			country: "Austria"
		}
		pets: [ 
			Dog {	
				name: "Timmy"
				breed: "Border Collie"
				dogTag: 12345678
			},
			Cat {	
				name: "Tigger"
				breed: "British Shorthair"
			}
		]
	}

QON typed sample with references (QON schema reqired):
	
	Person {	
		name: "Stephan"
		address: {
			street: "Peter-Jordan-Strasse"
			zip: "1180"
			city: "Vienna"
			country -> "Austria"
		}
		pets: [ 
			Dog {	
				name: "Timmy"
				breed -> "Border Collie"
				dogTag: 12345678
			},
			Cat {	
				name: "Tigger"
				breed -> "British Shorthair"
			}
		]
	}

Use a schema, define the namespace and import namesspaces with system attributes:<br>
(Default types defined in the schema don't need to be specified explicitly.)

	{
		$namespace: "org.iworkz.qon.demo"
		$imports : [
			"org.iworkz.qon.demo.countries.*",
			"org.iworkz.qon.demo.animals.*"
		] 
		$schema -> "org.iworkz.qon.demo.schema.DemoSchema"
	
	
		name: "Stephan"
		address: {
			street: "Peter-Jordan-Strasse"
			zip: "1180"
			city: "Vienna"
			country -> "Austria"
		}
		pets: [ 
			Dog {	
				name: "Timmy"
				breed -> "Border Collie"
				dogTag: 12345678
			},
			Cat {	
				name: "Tigger"
				breed -> "British Shorthair"
			}
		]
	}
