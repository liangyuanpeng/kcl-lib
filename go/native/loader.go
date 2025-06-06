package native

import (
	"os"
	"path/filepath"
	"runtime"

	"kcl-lang.io/lib/go/install"
	lazypath "kcl-lang.io/lib/go/path"
)

const libName = "kclvm_cli_cdylib"

func libPath() (path string, err error) {
	return lazypath.CacheHomeWithError()
}

func fullLibName() string {
	fullLibName := "lib" + libName + ".so"
	if runtime.GOOS == "darwin" {
		fullLibName = "lib" + libName + ".dylib"
	} else if runtime.GOOS == "windows" {
		fullLibName = libName + ".dll"
	}
	return fullLibName
}

func loadServiceNativeLib() (uintptr, error) {
	libPath, err := libPath()
	libPath = filepath.Join(libPath, "kcl")
	envLibHome := os.Getenv("KCL_LIB_HOME")
	if envLibHome != "" {
		libPath = envLibHome
	}
	if err != nil {
		return 0, err
	}
	err = install.InstallKclvm(libPath)
	if err != nil {
		return 0, err
	}
	libFullPath := filepath.Join(libPath, fullLibName())
	// open the C library
	libm, err := openLibrary(libFullPath)
	if err != nil {
		return 0, err
	}
	return libm, nil
}
