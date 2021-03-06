//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.11 at 02:51:30 PM GST 
//


package com.ripple.poc.response.objectmapper;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the test package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Root }
     * 
     */
    public Root createRoot() {
        return new Root();
    }

    /**
     * Create an instance of {@link Root.Result }
     * 
     */
    public Root.Result createRootResult() {
        return new Root.Result();
    }

    /**
     * Create an instance of {@link Root.Result.Info }
     * 
     */
    public Root.Result.Info createRootResultInfo() {
        return new Root.Result.Info();
    }

    /**
     * Create an instance of {@link Root.Result.Info.StateAccounting }
     * 
     */
    public Root.Result.Info.StateAccounting createRootResultInfoStateAccounting() {
        return new Root.Result.Info.StateAccounting();
    }

    /**
     * Create an instance of {@link Root.Result.Info.LastClose }
     * 
     */
    public Root.Result.Info.LastClose createRootResultInfoLastClose() {
        return new Root.Result.Info.LastClose();
    }

    /**
     * Create an instance of {@link Root.Result.Info.ValidatedLedger }
     * 
     */
    public Root.Result.Info.ValidatedLedger createRootResultInfoValidatedLedger() {
        return new Root.Result.Info.ValidatedLedger();
    }

    /**
     * Create an instance of {@link Root.Result.Info.StateAccounting.Connected }
     * 
     */
    public Root.Result.Info.StateAccounting.Connected createRootResultInfoStateAccountingConnected() {
        return new Root.Result.Info.StateAccounting.Connected();
    }

    /**
     * Create an instance of {@link Root.Result.Info.StateAccounting.Disconnected }
     * 
     */
    public Root.Result.Info.StateAccounting.Disconnected createRootResultInfoStateAccountingDisconnected() {
        return new Root.Result.Info.StateAccounting.Disconnected();
    }

    /**
     * Create an instance of {@link Root.Result.Info.StateAccounting.Full }
     * 
     */
    public Root.Result.Info.StateAccounting.Full createRootResultInfoStateAccountingFull() {
        return new Root.Result.Info.StateAccounting.Full();
    }

    /**
     * Create an instance of {@link Root.Result.Info.StateAccounting.Syncing }
     * 
     */
    public Root.Result.Info.StateAccounting.Syncing createRootResultInfoStateAccountingSyncing() {
        return new Root.Result.Info.StateAccounting.Syncing();
    }

    /**
     * Create an instance of {@link Root.Result.Info.StateAccounting.Tracking }
     * 
     */
    public Root.Result.Info.StateAccounting.Tracking createRootResultInfoStateAccountingTracking() {
        return new Root.Result.Info.StateAccounting.Tracking();
    }

}
