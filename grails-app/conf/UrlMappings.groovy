class UrlMappings {

	static mappings = {
        "/person"(controller: "name", action: "generatePerson")
        "/employee"(controller: "name", action: "generateEmployee")

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
