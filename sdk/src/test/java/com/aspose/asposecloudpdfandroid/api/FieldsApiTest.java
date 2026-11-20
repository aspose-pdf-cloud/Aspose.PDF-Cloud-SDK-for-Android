/**
 *
 * Copyright (c) 2026 Aspose.PDF Cloud
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */


package com.aspose.asposecloudpdfandroid.api;

import com.aspose.asposecloudpdfandroid.ApiException;
import com.aspose.asposecloudpdfandroid.model.AsposeResponse;
import com.aspose.asposecloudpdfandroid.model.CheckBoxField;
import com.aspose.asposecloudpdfandroid.model.CheckBoxFieldResponse;
import com.aspose.asposecloudpdfandroid.model.CheckBoxFieldsResponse;
import com.aspose.asposecloudpdfandroid.model.ComboBoxField;
import com.aspose.asposecloudpdfandroid.model.ComboBoxFieldResponse;
import com.aspose.asposecloudpdfandroid.model.ComboBoxFieldsResponse;
import com.aspose.asposecloudpdfandroid.model.Field;
import com.aspose.asposecloudpdfandroid.model.FieldResponse;
import com.aspose.asposecloudpdfandroid.model.Fields;
import com.aspose.asposecloudpdfandroid.model.FieldsResponse;
import com.aspose.asposecloudpdfandroid.model.ListBoxField;
import com.aspose.asposecloudpdfandroid.model.ListBoxFieldResponse;
import com.aspose.asposecloudpdfandroid.model.ListBoxFieldsResponse;
import com.aspose.asposecloudpdfandroid.model.RadioButtonField;
import com.aspose.asposecloudpdfandroid.model.RadioButtonFieldResponse;
import com.aspose.asposecloudpdfandroid.model.RadioButtonFieldsResponse;
import com.aspose.asposecloudpdfandroid.model.SignatureField;
import com.aspose.asposecloudpdfandroid.model.SignatureFieldResponse;
import com.aspose.asposecloudpdfandroid.model.SignatureFieldsResponse;
import com.aspose.asposecloudpdfandroid.model.TextBoxField;
import com.aspose.asposecloudpdfandroid.model.TextBoxFieldResponse;
import com.aspose.asposecloudpdfandroid.model.TextBoxFieldsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FieldsApi
 */
@Ignore
public class FieldsApiTest {

    private final FieldsApi api = new FieldsApi();

    
    /**
     * Delete document field by name.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFieldTest() throws ApiException {
        String name = null;
        String fieldName = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.deleteField(name, fieldName, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document checkbox field by name.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCheckBoxFieldTest() throws ApiException {
        String name = null;
        String fieldName = null;
        String storage = null;
        String folder = null;
        CheckBoxFieldResponse response = api.getCheckBoxField(name, fieldName, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document combobox field by name.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getComboBoxFieldTest() throws ApiException {
        String name = null;
        String fieldName = null;
        String storage = null;
        String folder = null;
        ComboBoxFieldResponse response = api.getComboBoxField(name, fieldName, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document checkbox fields.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentCheckBoxFieldsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        CheckBoxFieldsResponse response = api.getDocumentCheckBoxFields(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document combobox fields.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentComboBoxFieldsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        ComboBoxFieldsResponse response = api.getDocumentComboBoxFields(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document listbox fields.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentListBoxFieldsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        ListBoxFieldsResponse response = api.getDocumentListBoxFields(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document radiobutton fields.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentRadioButtonFieldsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        RadioButtonFieldsResponse response = api.getDocumentRadioButtonFields(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document signature fields.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentSignatureFieldsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        SignatureFieldsResponse response = api.getDocumentSignatureFields(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document text box fields.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentTextBoxFieldsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        TextBoxFieldsResponse response = api.getDocumentTextBoxFields(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Get document field by name.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFieldTest() throws ApiException {
        String name = null;
        String fieldName = null;
        String storage = null;
        String folder = null;
        FieldResponse response = api.getField(name, fieldName, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Get document fields.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFieldsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        FieldsResponse response = api.getFields(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document listbox field by name.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getListBoxFieldTest() throws ApiException {
        String name = null;
        String fieldName = null;
        String storage = null;
        String folder = null;
        ListBoxFieldResponse response = api.getListBoxField(name, fieldName, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page checkbox fields.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageCheckBoxFieldsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        CheckBoxFieldsResponse response = api.getPageCheckBoxFields(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page combobox fields.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageComboBoxFieldsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        ComboBoxFieldsResponse response = api.getPageComboBoxFields(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page listbox fields.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageListBoxFieldsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        ListBoxFieldsResponse response = api.getPageListBoxFields(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page radiobutton fields.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageRadioButtonFieldsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        RadioButtonFieldsResponse response = api.getPageRadioButtonFields(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page signature fields.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageSignatureFieldsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        SignatureFieldsResponse response = api.getPageSignatureFields(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page text box fields.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageTextBoxFieldsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        TextBoxFieldsResponse response = api.getPageTextBoxFields(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document RadioButton field by name.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRadioButtonFieldTest() throws ApiException {
        String name = null;
        String fieldName = null;
        String storage = null;
        String folder = null;
        RadioButtonFieldResponse response = api.getRadioButtonField(name, fieldName, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document signature field by name.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSignatureFieldTest() throws ApiException {
        String name = null;
        String fieldName = null;
        String storage = null;
        String folder = null;
        SignatureFieldResponse response = api.getSignatureField(name, fieldName, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document text box field by name.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTextBoxFieldTest() throws ApiException {
        String name = null;
        String fieldName = null;
        String storage = null;
        String folder = null;
        TextBoxFieldResponse response = api.getTextBoxField(name, fieldName, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Add document checkbox fields.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCheckBoxFieldsTest() throws ApiException {
        String name = null;
        List<CheckBoxField> fields = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postCheckBoxFields(name, fields, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Add document combobox fields.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postComboBoxFieldsTest() throws ApiException {
        String name = null;
        List<ComboBoxField> fields = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postComboBoxFields(name, fields, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Create field.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCreateFieldTest() throws ApiException {
        String name = null;
        Integer page = null;
        Field field = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postCreateField(name, page, field, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Add document listbox fields.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postListBoxFieldsTest() throws ApiException {
        String name = null;
        List<ListBoxField> fields = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postListBoxFields(name, fields, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Add document RadioButton fields.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postRadioButtonFieldsTest() throws ApiException {
        String name = null;
        List<RadioButtonField> fields = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postRadioButtonFields(name, fields, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Add document signature field.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSignatureFieldTest() throws ApiException {
        String name = null;
        SignatureField field = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postSignatureField(name, field, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Add document text box fields.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postTextBoxFieldsTest() throws ApiException {
        String name = null;
        List<TextBoxField> fields = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postTextBoxFields(name, fields, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Replace document checkbox field
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putCheckBoxFieldTest() throws ApiException {
        String name = null;
        String fieldName = null;
        CheckBoxField field = null;
        String storage = null;
        String folder = null;
        CheckBoxFieldResponse response = api.putCheckBoxField(name, fieldName, field, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Replace document combobox field
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putComboBoxFieldTest() throws ApiException {
        String name = null;
        String fieldName = null;
        ComboBoxField field = null;
        String storage = null;
        String folder = null;
        ComboBoxFieldResponse response = api.putComboBoxField(name, fieldName, field, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Flatten form fields in document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putFieldsFlattenTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.putFieldsFlatten(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Replace document listbox field
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putListBoxFieldTest() throws ApiException {
        String name = null;
        String fieldName = null;
        ListBoxField field = null;
        String storage = null;
        String folder = null;
        ListBoxFieldResponse response = api.putListBoxField(name, fieldName, field, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Replace document RadioButton field
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putRadioButtonFieldTest() throws ApiException {
        String name = null;
        String fieldName = null;
        RadioButtonField field = null;
        String storage = null;
        String folder = null;
        RadioButtonFieldResponse response = api.putRadioButtonField(name, fieldName, field, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Replace document signature field.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSignatureFieldTest() throws ApiException {
        String name = null;
        String fieldName = null;
        SignatureField field = null;
        String storage = null;
        String folder = null;
        SignatureFieldResponse response = api.putSignatureField(name, fieldName, field, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Replace document text box field
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putTextBoxFieldTest() throws ApiException {
        String name = null;
        String fieldName = null;
        TextBoxField field = null;
        String storage = null;
        String folder = null;
        TextBoxFieldResponse response = api.putTextBoxField(name, fieldName, field, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Update field.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateFieldTest() throws ApiException {
        String name = null;
        String fieldName = null;
        Field field = null;
        String storage = null;
        String folder = null;
        FieldResponse response = api.putUpdateField(name, fieldName, field, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Update fields.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateFieldsTest() throws ApiException {
        String name = null;
        Fields fields = null;
        String storage = null;
        String folder = null;
        FieldsResponse response = api.putUpdateFields(name, fields, storage, folder);

        // TODO: test validations
    }
    
}
