
package h225;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.*;
import org.bn.annotations.*;
import org.bn.annotations.constraints.*;
import org.bn.coders.*;
import org.bn.types.*;




    @ASN1PreparedElement
    @ASN1Choice ( name = "RegistrationRejectReason" )
    public class RegistrationRejectReason implements IASN1PreparedElement {
            
        @ASN1Null ( name = "discoveryRequired" ) 
    
        @ASN1Element ( name = "discoveryRequired", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private org.bn.types.NullObject discoveryRequired = null;
                
  
        @ASN1Null ( name = "invalidRevision" ) 
    
        @ASN1Element ( name = "invalidRevision", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private org.bn.types.NullObject invalidRevision = null;
                
  
        @ASN1Null ( name = "invalidCallSignalAddress" ) 
    
        @ASN1Element ( name = "invalidCallSignalAddress", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private org.bn.types.NullObject invalidCallSignalAddress = null;
                
  
        @ASN1Null ( name = "invalidRASAddress" ) 
    
        @ASN1Element ( name = "invalidRASAddress", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private org.bn.types.NullObject invalidRASAddress = null;
                
  
@ASN1SequenceOf( name = "duplicateAlias", isSetOf = false ) 

    
        @ASN1Element ( name = "duplicateAlias", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private java.util.Collection<AliasAddress>  duplicateAlias = null;
                
  
        @ASN1Null ( name = "invalidTerminalType" ) 
    
        @ASN1Element ( name = "invalidTerminalType", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private org.bn.types.NullObject invalidTerminalType = null;
                
  
        @ASN1Null ( name = "undefinedReason" ) 
    
        @ASN1Element ( name = "undefinedReason", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private org.bn.types.NullObject undefinedReason = null;
                
  
        @ASN1Null ( name = "transportNotSupported" ) 
    
        @ASN1Element ( name = "transportNotSupported", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private org.bn.types.NullObject transportNotSupported = null;
                
  
        
        public org.bn.types.NullObject getDiscoveryRequired () {
            return this.discoveryRequired;
        }

        public boolean isDiscoveryRequiredSelected () {
            return this.discoveryRequired != null;
        }

        private void setDiscoveryRequired (org.bn.types.NullObject value) {
            this.discoveryRequired = value;
        }

        
        public void selectDiscoveryRequired () {
            selectDiscoveryRequired (new org.bn.types.NullObject());
	}
	
        public void selectDiscoveryRequired (org.bn.types.NullObject value) {
            this.discoveryRequired = value;
            
                    setInvalidRevision(null);
                
                    setInvalidCallSignalAddress(null);
                
                    setInvalidRASAddress(null);
                
                    setDuplicateAlias(null);
                
                    setInvalidTerminalType(null);
                
                    setUndefinedReason(null);
                
                    setTransportNotSupported(null);
                            
        }

        
  
        
        public org.bn.types.NullObject getInvalidRevision () {
            return this.invalidRevision;
        }

        public boolean isInvalidRevisionSelected () {
            return this.invalidRevision != null;
        }

        private void setInvalidRevision (org.bn.types.NullObject value) {
            this.invalidRevision = value;
        }

        
        public void selectInvalidRevision () {
            selectInvalidRevision (new org.bn.types.NullObject());
	}
	
        public void selectInvalidRevision (org.bn.types.NullObject value) {
            this.invalidRevision = value;
            
                    setDiscoveryRequired(null);
                
                    setInvalidCallSignalAddress(null);
                
                    setInvalidRASAddress(null);
                
                    setDuplicateAlias(null);
                
                    setInvalidTerminalType(null);
                
                    setUndefinedReason(null);
                
                    setTransportNotSupported(null);
                            
        }

        
  
        
        public org.bn.types.NullObject getInvalidCallSignalAddress () {
            return this.invalidCallSignalAddress;
        }

        public boolean isInvalidCallSignalAddressSelected () {
            return this.invalidCallSignalAddress != null;
        }

        private void setInvalidCallSignalAddress (org.bn.types.NullObject value) {
            this.invalidCallSignalAddress = value;
        }

        
        public void selectInvalidCallSignalAddress () {
            selectInvalidCallSignalAddress (new org.bn.types.NullObject());
	}
	
        public void selectInvalidCallSignalAddress (org.bn.types.NullObject value) {
            this.invalidCallSignalAddress = value;
            
                    setDiscoveryRequired(null);
                
                    setInvalidRevision(null);
                
                    setInvalidRASAddress(null);
                
                    setDuplicateAlias(null);
                
                    setInvalidTerminalType(null);
                
                    setUndefinedReason(null);
                
                    setTransportNotSupported(null);
                            
        }

        
  
        
        public org.bn.types.NullObject getInvalidRASAddress () {
            return this.invalidRASAddress;
        }

        public boolean isInvalidRASAddressSelected () {
            return this.invalidRASAddress != null;
        }

        private void setInvalidRASAddress (org.bn.types.NullObject value) {
            this.invalidRASAddress = value;
        }

        
        public void selectInvalidRASAddress () {
            selectInvalidRASAddress (new org.bn.types.NullObject());
	}
	
        public void selectInvalidRASAddress (org.bn.types.NullObject value) {
            this.invalidRASAddress = value;
            
                    setDiscoveryRequired(null);
                
                    setInvalidRevision(null);
                
                    setInvalidCallSignalAddress(null);
                
                    setDuplicateAlias(null);
                
                    setInvalidTerminalType(null);
                
                    setUndefinedReason(null);
                
                    setTransportNotSupported(null);
                            
        }

        
  
        
        public java.util.Collection<AliasAddress>  getDuplicateAlias () {
            return this.duplicateAlias;
        }

        public boolean isDuplicateAliasSelected () {
            return this.duplicateAlias != null;
        }

        private void setDuplicateAlias (java.util.Collection<AliasAddress>  value) {
            this.duplicateAlias = value;
        }

        
        public void selectDuplicateAlias (java.util.Collection<AliasAddress>  value) {
            this.duplicateAlias = value;
            
                    setDiscoveryRequired(null);
                
                    setInvalidRevision(null);
                
                    setInvalidCallSignalAddress(null);
                
                    setInvalidRASAddress(null);
                
                    setInvalidTerminalType(null);
                
                    setUndefinedReason(null);
                
                    setTransportNotSupported(null);
                            
        }

        
  
        
        public org.bn.types.NullObject getInvalidTerminalType () {
            return this.invalidTerminalType;
        }

        public boolean isInvalidTerminalTypeSelected () {
            return this.invalidTerminalType != null;
        }

        private void setInvalidTerminalType (org.bn.types.NullObject value) {
            this.invalidTerminalType = value;
        }

        
        public void selectInvalidTerminalType () {
            selectInvalidTerminalType (new org.bn.types.NullObject());
	}
	
        public void selectInvalidTerminalType (org.bn.types.NullObject value) {
            this.invalidTerminalType = value;
            
                    setDiscoveryRequired(null);
                
                    setInvalidRevision(null);
                
                    setInvalidCallSignalAddress(null);
                
                    setInvalidRASAddress(null);
                
                    setDuplicateAlias(null);
                
                    setUndefinedReason(null);
                
                    setTransportNotSupported(null);
                            
        }

        
  
        
        public org.bn.types.NullObject getUndefinedReason () {
            return this.undefinedReason;
        }

        public boolean isUndefinedReasonSelected () {
            return this.undefinedReason != null;
        }

        private void setUndefinedReason (org.bn.types.NullObject value) {
            this.undefinedReason = value;
        }

        
        public void selectUndefinedReason () {
            selectUndefinedReason (new org.bn.types.NullObject());
	}
	
        public void selectUndefinedReason (org.bn.types.NullObject value) {
            this.undefinedReason = value;
            
                    setDiscoveryRequired(null);
                
                    setInvalidRevision(null);
                
                    setInvalidCallSignalAddress(null);
                
                    setInvalidRASAddress(null);
                
                    setDuplicateAlias(null);
                
                    setInvalidTerminalType(null);
                
                    setTransportNotSupported(null);
                            
        }

        
  
        
        public org.bn.types.NullObject getTransportNotSupported () {
            return this.transportNotSupported;
        }

        public boolean isTransportNotSupportedSelected () {
            return this.transportNotSupported != null;
        }

        private void setTransportNotSupported (org.bn.types.NullObject value) {
            this.transportNotSupported = value;
        }

        
        public void selectTransportNotSupported () {
            selectTransportNotSupported (new org.bn.types.NullObject());
	}
	
        public void selectTransportNotSupported (org.bn.types.NullObject value) {
            this.transportNotSupported = value;
            
                    setDiscoveryRequired(null);
                
                    setInvalidRevision(null);
                
                    setInvalidCallSignalAddress(null);
                
                    setInvalidRASAddress(null);
                
                    setDuplicateAlias(null);
                
                    setInvalidTerminalType(null);
                
                    setUndefinedReason(null);
                            
        }

        
  

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(RegistrationRejectReason.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            