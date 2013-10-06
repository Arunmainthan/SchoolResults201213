<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib uri="http://displaytag.sf.net" prefix="display"%>

<display:table export="true" id="tableData" name="results"
			requestURI="/pages/displayAllResultsSort.action" pagesize="5">
			<display:column property="school.schoolName" title="School"
				sortable="true" />
			<display:column property="latestY3" title="Y3" sortable="true" />
			<display:column property="latestY5" title="Y5" sortable="true" />
			<display:column property="latestY7" title="Y7" sortable="true" />
			<display:column property="latestY9" title="Y9" sortable="true" />
			<display:column property="rawGainY3Y5" title="Raw Gain Y3 to Y5"
				sortable="true" />
			<display:column property="factoredGainY3Y5"
				title="factored Gain Y3 to Y5" sortable="true" />
			<display:column property="glgY3Y5" title="GLG% Y3 to Y5"
				sortable="true" />
			<display:column property="latestGainInGainY3Y5"
				title="Gain in Gain Y3 to Y5" sortable="true" />
				sortable="true" />
</display:table>