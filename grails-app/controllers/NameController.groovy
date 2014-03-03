import grails.converters.JSON
import net.spantree.namegenius.NameGenius

class NameController {
    NameGenius nameGenius

    def generatePerson(){
        def person = nameGenius.generate(true)
        def json = [firstName: person.firstName, lastName: person.lastName, avatar: person.avatarUrl]
        render json as JSON
    }

    def generateEmployee(){
        def employee = nameGenius.generateEmployee(true)
        def json = [firstName: employee.firstName, lastName: employee.lastName, jobTitle: employee.jobName, company: employee.companyName, avatar: employee.avatarUrl]
        render json as JSON
    }
}
