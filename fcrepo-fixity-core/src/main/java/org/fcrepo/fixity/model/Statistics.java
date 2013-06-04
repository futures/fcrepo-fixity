
package org.fcrepo.fixity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.fcrepo.fixity.service.FixityService;

@XmlRootElement(name = "general-stat", namespace = FixityService.FIXITY_NAMESPACE)
@XmlAccessorType(XmlAccessType.FIELD)
public class Statistics {

    @XmlAttribute(name = "object-count")
    private long numObjects;

    @XmlAttribute(name = "error-count")
    private long errorCount;

    @XmlAttribute(name = "success-count")
    private long successCount;

    @XmlAttribute(name = "repair-count")
    private long repairCount;

    public long getNumObjects() {
        return numObjects;
    }

    public void setNumObjects(long numObjects) {
        this.numObjects = numObjects;
    }

    public long getNumErrors() {
        return errorCount;
    }

    public void setErrorCount(long numErrors) {
        this.errorCount = numErrors;
    }

    public long getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(long successCount) {
        this.successCount = successCount;
    }

    public long getRepairCount() {
        return this.repairCount;
    }

    public void setRepairCount(long repairCount) {
        this.repairCount = repairCount;
    }

}