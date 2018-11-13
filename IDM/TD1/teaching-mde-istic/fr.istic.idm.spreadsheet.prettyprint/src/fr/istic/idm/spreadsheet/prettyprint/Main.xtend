package fr.istic.idm.spreadsheet.prettyprint

class Main {
	def static void main(String[] args) {
		val pkg = EcoreLoader::loadEcore(
			"../fr.istic.idm.spreadsheet.model/model/spreadsheet.ecore")

		/* 1: Pretty-printing with PrettyPrintEcore */
		val ppe = new PrettyPrintEcore
		println('''printFlat(«pkg.name»):''')
		ppe.printFlat(pkg)

		println('''printShort(«pkg.name»):''')
		ppe.printShort(pkg)

		println('''printFlatShort(«pkg.name»):''')
		ppe.printFlatShort(pkg)

		println
		println("=============================")
		println

	


		/* 2: You may now try your pretty-printers on more realistic
		 *    Ecore files, such as Ecore.ecore itself */
	}
}
