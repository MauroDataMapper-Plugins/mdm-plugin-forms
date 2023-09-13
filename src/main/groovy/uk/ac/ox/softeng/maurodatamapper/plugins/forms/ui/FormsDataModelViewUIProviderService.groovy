package uk.ac.ox.softeng.maurodatamapper.plugins.forms.ui

import uk.ac.ox.softeng.maurodatamapper.datamodel.DataModel
import uk.ac.ox.softeng.maurodatamapper.ui.providers.DataModelViewUIProviderService

import grails.io.IOUtils

import java.nio.charset.StandardCharsets

class FormsDataModelViewUIProviderService extends DataModelViewUIProviderService{
    @Override
    String getDisplayName() {
        return "Forms Data Model View UI Provider Service"
    }

    @Override
    String getVersion() {
        return "1.0.0"
    }

    @Override
    boolean providesDataModelView(DataModel dataModel) {
        return true
    }

    @Override
    String getTabName() {
        return "Form View"
    }

    @Override
    byte[] getJSWebComponent(UUID dataModelId) {
        InputStream inputStream = this.class.classLoader.getResourceAsStream("form-data-model-view-component/dist/form-data-model-view-component/main.js")
        System.err.println(inputStream)
        IOUtils.toString(inputStream, StandardCharsets.UTF_8 as String).bytes
    }
}
