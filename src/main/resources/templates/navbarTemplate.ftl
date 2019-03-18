<nav id="myNavbar" class="navbar navbar-default navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbarCollapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/main">Z nosem w kodzie</a>
        </div>
        <div class="collapse navbar-collapse" id="navbarCollapse">

            <ul class="nav navbar-nav">

                <#if springMacroRequestContext.requestUri?contains("/main")>
                <li class="nav-item active">
                <#else>
                <li class="nav-item">
                </#if>
                    <a href="/main"><span class="glyphicon glyphicon-home"></span>  Strona główna</a>
                </li>

                <#if springMacroRequestContext.requestUri?contains("/spojChallenge")>
                <li class="nav-item active">
                <#else>
                <li class="nav-item">
                </#if>
                    <a href="/spojChallenge">Spoj challenge</a>
                </li>

                <#if springMacroRequestContext.requestUri?contains("/algorithmChallenge")>
                <li class="nav-item active">
                <#else>
                <li class="nav-item">
                </#if>
                    <a href="/algorithmChallenge">Algorytm challenge</a>
                </li>

                <#if springMacroRequestContext.requestUri?contains("/windowApplicationsChallenge")>
                <li class="nav-item active">
                <#else>
                <li class="nav-item">
                </#if>
                    <a href="/windowApplicationsChallenge">Aplikacje okienkowe</a>
                </li>

                <#if springMacroRequestContext.requestUri?contains("/about")>
                <li class="nav-item active">
                <#else>
                <li class="nav-item">
                </#if>
                    <a href="/about">O mnie</a>
                </li>

                <#if springMacroRequestContext.requestUri?contains("/contact")>
                <li class="nav-item active">
                <#else>
                <li class="nav-item">
                </#if>
                    <a href="/contact">Kontakt</a>
                </li>

                <#if springMacroRequestContext.requestUri?contains("/faq")>
                <li class="nav-item active">
                <#else>
                <li class="nav-item">
                </#if>
                    <a href="/faq">FAQ</a>
                </li>

                <li style="right:0; position:absolute"><a href="/main"><span class="glyphicon glyphicon-user">  Logowanie</a></li>
            </ul>
        </div>
    </div>
</nav>