/**
 * @author I077988
 */
package com.cnk.travelogix.suppliers.client;

import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRS;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRS;

/**
 * @author I077988
 */
public interface SupplierClient {

    /**
     * @param url
     * @param airInterfaceRQ
     * @return AirInterfaceRS
     */
    public AirInterfaceRS postForAirInterface(final String url, final AirInterfaceRQ airInterfaceRQ);

    /**
     * @param url
     * @param accoInterfaceRQ
     * @return AirInterfaceRS
     */
    public AccoInterfaceRS postForAccoInterface(final String url, final AccoInterfaceRQ accoInterfaceRQ);

}
