package models;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by Yi on 7/11/2016.
 */
public class PatientControl {


    public String createPatient(Patient patient){

        ObjectMapper om = new ObjectMapper();
        try{
            String json = om.writeValueAsString(patient);
            String msg =  HTTP_REQUEST.excutePost("IBMurl", json);
            return msg;

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return "Failed";
    }

    public Patient findPatient(Patient patient) throws IOException {

        String url = "url";
        String targetURL = url + "/" + patient.getUSERNAME();

        String json = HTTP_REQUEST.excuteGet(targetURL);
        ObjectMapper om = new ObjectMapper();
        Patient p  = om.readValue(json, Patient.class);

        return p;

    }

    public String createDoc(Doctor doc){

        ObjectMapper om = new ObjectMapper();
        try{
            String json = om.writeValueAsString(doc);
            String msg =  HTTP_REQUEST.excutePost("IBMurl", json);
            return msg;

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return "Failed";
    }

    public Doctor findDoc(Doctor doc) throws IOException {

        String url = "url";
        String targetURL = url + "/" + doc.getUSERNAME();

        String json = HTTP_REQUEST.excuteGet(targetURL);
        ObjectMapper om = new ObjectMapper();
        Doctor doctor  = om.readValue(json, Doctor.class);

        return doctor;

    }

}
