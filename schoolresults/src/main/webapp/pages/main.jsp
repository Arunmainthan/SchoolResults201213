<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib uri="http://displaytag.sf.net" prefix="display"%>
<html>
<head></head>
<body>

	<h2>Pinces School District</h2>

	<div id="uniqueSubjectsDiv">
		<s:select label="Filter By" headerKey="-1" headerValue="Select Filter"
			list="uniqueSubjects" name="filterBy" value="defaultValue" />
	</div>
	<div id="resultsDisplayDiv">
		<!--<s:if test="results.size() > 0">
			<table border="1px" cellpadding="8px">
				<tr>
					<th>School</th>
					<th>Y3</th>
					<th>Y5</th>
					<th>Y7</th>
					<th>Y9</th>
					<th>Raw Gain Y3 to Y5</th>
					<th>factored Gain Y3 to Y5</th>
					<th>GLG% Y3 to Y5</th>
					<th>Gain in Gain Y3 to Y5</th>
				</tr>
				<s:iterator value="results">
					<tr>
						<td><s:property value="school.schoolName" /></td>
						<td><s:property value="latestY3" /></td>
						<td><s:property value="latestY5" /></td>
						<td><s:property value="latestY7" /></td>
						<td><s:property value="latestY9" /></td>
						<td><s:property value="rawGainY3Y5" /></td>
						<td><s:property value="factoredGainY3Y5" /></td>
						<td><s:property value="glgY3Y5" /></td>
						<td><s:property value="latestGainInGainY3Y5" /></td>
					</tr>
				</s:iterator>
			</table>
		</s:if>
		-->
		<s:url id="thisUrl"/>
		<display:table export="true" id="data"
			name="results" requestURI="/pages/displayAllResults.action"
			pagesize="5">
			<display:column property="school.schoolName" title="School" sortable="true" />
			<display:column property="latestY3" title="Y3" sortable="true" />
			<display:column property="latestY5" title="Y5" sortable="true" />
			<display:column property="latestY7" title="Y7" sortable="true" />
			<display:column property="latestY9" title="Y9" sortable="true" />
			<display:column property="rawGainY3Y5" title="Raw Gain Y3 to Y5" sortable="true" />
			<display:column property="factoredGainY3Y5" title="factored Gain Y3 to Y5" sortable="true" />
			<display:column property="glgY3Y5" title="GLG% Y3 to Y5" sortable="true" />
			<display:column property="latestGainInGainY3Y5" title="Gain in Gain Y3 to Y5" sortable="true" />
				sortable="true" />
		</display:table>
	</div>



</body>
</html>