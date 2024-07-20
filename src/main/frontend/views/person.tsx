import {AutoCrud} from "@vaadin/hilla-react-crud";
import {PersonService} from "Frontend/generated/endpoints";
import PersonModel from "Frontend/generated/com/balhaoui/ChatBotRagApp/entities/PersonModel";

export default function Person(){
    return(
        <AutoCrud service={PersonService} model={PersonModel}/>
    );
}