<#include "headerTemplate.ftl">
<body>
<#include "navbarTemplate.ftl">

<div class="container">
    <div class="row">
        <div class="col-xs-12">
            <div class="jumbotron">
                <form action="processForm" method="GET"/>
                    <input type="text" name="userName" placeholder="Enter You Name" />
                    <input type="submit"/>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>