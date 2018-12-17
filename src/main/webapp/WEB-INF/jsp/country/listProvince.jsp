<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:forEach items="${countryModelList}" var="countryModel"
	varStatus="number">
	<tr>
		<td>${countryModel.code}</td>
		<td>${countryModel.name}</td>
		<td>
			<!-- Dropdown Buttons -->
			<div class="dropdown">
				<button class="btn btn-link dropdown-toggle" type="button"
					data-toggle="dropdown">
					<i class="fa fa-bars"></i>
				</button>

				<!-- Dropdown Menus -->
				<ul class="dropdown-menu">
					<!-- Edit Button -->
					<li><button type="button" class="btn btn-link" id="btn-edit"
							value="${countryModel.id}">View</button></li>
				</ul>
			</div>
		</td>
	</tr>
</c:forEach>