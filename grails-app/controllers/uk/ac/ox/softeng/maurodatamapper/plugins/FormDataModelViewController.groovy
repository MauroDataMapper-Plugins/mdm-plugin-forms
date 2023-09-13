package uk.ac.ox.softeng.maurodatamapper.plugins

import uk.ac.ox.softeng.maurodatamapper.core.controller.CatalogueItemController
import uk.ac.ox.softeng.maurodatamapper.datamodel.DataModel

import grails.rest.*
import grails.converters.*

class FormDataModelViewController {

    FormDataModelViewService formDataModelViewService

    static responseFormats = ['json', 'xml']

    Map getFormModel() {

        System.err.println(params.dataModelId)

        respond(formDataModelViewService.getFormModelAsMap(params.dataModelId))
    }
}
